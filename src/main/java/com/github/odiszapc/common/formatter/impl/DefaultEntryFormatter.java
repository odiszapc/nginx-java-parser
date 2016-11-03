package com.github.odiszapc.common.formatter.impl;

import com.github.odiszapc.common.formatter.FormatterRepository;
import com.github.odiszapc.common.formatter.IndentSettableEntryFormatter;
import com.github.odiszapc.nginxparser.NgxEntryType;

public class DefaultEntryFormatter extends IndentSettableEntryFormatter {

    public DefaultEntryFormatter(DefaultEntryFormatter defaultEntryFormatter) {
        super(defaultEntryFormatter);
    }

    public DefaultEntryFormatter(FormatterRepository repository) {
        super(repository);
    }

    @Override
    public NgxEntryType[] supportedEntryTypes() {
        return new NgxEntryType[] { NgxEntryType.PARAM, NgxEntryType.COMMENT };
    }

    @Override
    public IndentSettableEntryFormatter copy() {
        return new DefaultEntryFormatter(this);
    }

}
