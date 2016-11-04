package com.github.odiszapc.nginxparser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.github.odiszapc.nginxparser.annotation.NgxTokenValue;

public class DefaultNgxEntrySerializer implements NgxEntrySerializer {

    private static final String UPPER_CHAR_REGEX = "(?=\\p{Upper})";

    @Override
    public NgxEntry serialize(String fieldName, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("obj should not be null");
        }
        Class<?> clazz = obj.getClass();
        if (isPrimaryClass(clazz)) {
            NgxParam param = new NgxParam();
            param.addValue(generateToken(fieldName));
            param.addValue(generateToken(obj.toString()));
            return param;
        } else {
            NgxBlock block = new NgxBlock();
            block.addValue(generateToken(fieldName));
            for (Field field : clazz.getFields()) {
                Annotation tokenAnnotation = field.getAnnotation(NgxTokenValue.class);
                NgxEntry entry;
                try {
                    if (tokenAnnotation != null) {
                        block.addValue(field.get(obj).toString());
                        continue;
                    }
                    entry = serialize(field.getName(), field.get(obj));
                    block.addEntry(entry);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return block;
        }
    }

    private static boolean isPrimaryClass(Class<?> clazz) {
        if (CharSequence.class.isAssignableFrom(clazz)) {
            return true;
        }
        if (clazz.isPrimitive()) {
            return true;
        }
        return false;
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
