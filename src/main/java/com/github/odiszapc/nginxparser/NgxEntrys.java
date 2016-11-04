package com.github.odiszapc.nginxparser;

import com.github.odiszapc.nginxparser.annotation.NgxType;

/**
 *
 * <p>
 * common util for NgxEntry
 * </p>
 * @author ${Author}
 * @version ${Version}
 *
 */
public class NgxEntrys {

    private static final NgxEntrySerializer serializer = new DefaultNgxEntrySerializer();

    /**
     *
     * <p>
     * parse a object to NgxEntry
     * </p>
     * @param obj
     * @return
     */
    public static NgxEntry parse(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("obj should not be null");
        }
        if (obj instanceof NgxEntry) {
            return (NgxEntry) obj;
        }
        Class<?> clazz = obj.getClass();
        String name;
        NgxType ngxType = clazz.getAnnotation(NgxType.class);
        if (ngxType != null) {
            name = ngxType.name();
        } else {
            name = clazz.getSimpleName();
        }
        return serializer.serialize(name, obj);
    }

}
