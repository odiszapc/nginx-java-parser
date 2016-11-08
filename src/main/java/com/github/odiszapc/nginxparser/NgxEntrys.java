package com.github.odiszapc.nginxparser;


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
        return serializer.serialize(null, obj);
    }

}
