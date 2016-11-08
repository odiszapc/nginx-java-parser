package com.github.odiszapc.nginxparser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;

import com.github.odiszapc.nginxparser.annotation.NgxTokenValue;
import com.github.odiszapc.nginxparser.annotation.NgxType;
import com.google.common.base.Defaults;

public class DefaultNgxEntrySerializer implements NgxEntrySerializer {

    private static final String UPPER_CHAR_REGEX = "(?=\\p{Upper})";

    @Override
    public NgxEntry serialize(String fieldName, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("obj should not be null");
        }
        if (obj instanceof NgxEntry) {
            return (NgxEntry) obj;
        }
        Class<?> clazz = obj.getClass();
        String realFiledName = getRealFieldName(fieldName,obj);

        // too complicated
        if (isPrimaryClass(clazz)) {
            NgxParam param = new NgxParam();
            param.addValue(generateToken(realFiledName));
            param.addValue(generateToken(obj.toString()));
            return param;
        } else {
            NgxBlock block = new NgxBlock();
            block.addValue(generateToken(realFiledName));
            for (Field field : clazz.getFields()) {
                NgxEntry entry;
                try {
                    Class<?> fieldClazz = field.getType();
                    Object fieldValue= field.get(obj);
                    if(isDefaultValue(fieldValue,fieldClazz)) {
                        continue;
                    }
                    Annotation tokenAnnotation = field.getAnnotation(NgxTokenValue.class);
                    if (tokenAnnotation != null) {
                        block.addValue(fieldValue.toString());
                        continue;
                    }
                    entry = serialize(field.getName(), fieldValue);
                    if (entry != null) {
                        block.addEntry(entry);
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return block;
        }
    }

    private static String getRealFieldName(String fieldName,Object obj){
        Class<?> clazz = obj.getClass();
        NgxType ngxType = clazz.getAnnotation(NgxType.class);
        if (ngxType != null) {
            return ngxType.name();
        } else if(StringUtils.isNotEmpty(fieldName)){
            return fieldName;
        }else{
            return getDefaultFieldName(obj);
        }
    }

    private static String getDefaultFieldName(Object obj){
        Class<?> clazz = obj.getClass();
        return clazz.getSimpleName();
    }

    private static boolean isPrimaryClass(Class<?> clazz) {
        if (CharSequence.class.isAssignableFrom(clazz)) {
            return true;
        }
        if (ClassUtils.isPrimitiveWrapper(clazz)) {
            return true;
        }
        return false;
    }

    private static boolean isDefaultValue(Object value, Class<?> clazz) {
        if (value == null) {
            return true;
        }
        Object defalutValue = Defaults.defaultValue(clazz);
        return value.equals(defalutValue);
    }

    public static String generateToken(String token) {
        String[] parts = token.split(UPPER_CHAR_REGEX);
        StringBuffer buf = new StringBuffer();
        for (String part : parts) {
            buf.append(part.toLowerCase());
            buf.append('_');
        }
        if (buf.length() > 0) {
            buf.deleteCharAt(buf.length() - 1);
        }
        return buf.toString();
    }

}
