package com.github.odiszapc.common.formatter.impl;

import com.github.odiszapc.common.formatter.EntryFormatter;
import com.github.odiszapc.common.formatter.FormatterRepository;
import com.github.odiszapc.common.formatter.IndentSettableEntryFormatter;
import com.github.odiszapc.nginxparser.NgxEntry;
import com.github.odiszapc.nginxparser.NgxEntryType;

//base config do not contains indent
public class NgxConfigFormatter extends NgxBlockFormatter {

    public NgxConfigFormatter(FormatterRepository repository) {
        super(repository);
    }

    @Override
    public int getIndent() {
        return 0;
    }

    @Override
    public StringBuffer formattedText(NgxEntry entry) {
        return formattedBlockBody(entry);
    }

    @Override
    protected EntryFormatter getFormatter(Class<? extends NgxEntry> formatterClazz) {
        EntryFormatter formatter = super.getFormatter(formatterClazz);
        if (formatter instanceof IndentSettableEntryFormatter) {
            ((IndentSettableEntryFormatter) formatter).setIndent(0);
        }
        return formatter;
    }

    @Override
    public NgxEntryType[] supportedEntryTypes() {
        return new NgxEntryType[] { NgxEntryType.CONFIG };
    }

}
