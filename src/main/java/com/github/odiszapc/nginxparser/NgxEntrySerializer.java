package com.github.odiszapc.nginxparser;

public interface NgxEntrySerializer {

    NgxEntry serialize(String fieldName, Object obj);
}
