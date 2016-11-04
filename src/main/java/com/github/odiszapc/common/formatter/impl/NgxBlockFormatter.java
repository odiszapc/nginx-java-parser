package com.github.odiszapc.common.formatter.impl;

import com.github.odiszapc.common.formatter.FormatterRepository;
import com.github.odiszapc.common.formatter.IndentSettableEntryFormatter;
import com.github.odiszapc.nginxparser.NgxBlock;
import com.github.odiszapc.nginxparser.NgxEntry;
import com.github.odiszapc.nginxparser.NgxEntryType;

public class NgxBlockFormatter extends IndentSettableEntryFormatter {

    public NgxBlockFormatter(NgxBlockFormatter ngxBlockFormatter) {
        super(ngxBlockFormatter);
    }

    public NgxBlockFormatter(FormatterRepository repository) {
        super(repository);
    }

    @Override
    public StringBuffer formattedText(NgxEntry entry) {
        StringBuffer buf = super.formattedText(entry);
        buf.append(formattedBlockBody(entry));
        buf.append("}\n");
        return buf;
    }

    protected StringBuffer formattedBlockBody(NgxEntry entry) {
        StringBuffer buf = new StringBuffer();
        if (!(entry instanceof NgxBlock)) {
            return buf;
        }
        NgxBlock block = (NgxBlock) entry;
        for (NgxEntry e : block.getEntries()) {
            buf.append(getFormatter(e.getClass()).formattedText(e));
        }
        buf.append(indentText());
        return buf;
    }

    @Override
    public NgxEntryType[] supportedEntryTypes() {
        return new NgxEntryType[] { NgxEntryType.BLOCK };
    }

    @Override
    public IndentSettableEntryFormatter copy() {
        return new NgxBlockFormatter(this);
    }

}
