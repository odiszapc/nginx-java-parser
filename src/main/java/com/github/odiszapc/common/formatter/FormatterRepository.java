package com.github.odiszapc.common.formatter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.odiszapc.common.formatter.impl.DefaultEntryFormatter;
import com.github.odiszapc.common.formatter.impl.NgxBlockFormatter;
import com.github.odiszapc.nginxparser.NgxEntry;
import com.github.odiszapc.nginxparser.NgxEntryType;

public class FormatterRepository {

    private static final EntryFormatter NULL_INDENT_SETTABLE_FORMATTER = new NullEntryFormatter();
    private Map<NgxEntryType, EntryFormatter> innerFormatters;
    private Map<NgxEntryType, IndentSettableEntryFormatter> indentSettableFormatters;

    public FormatterRepository() {
        initDefalutFormatters();
    }

    private void initDefalutFormatters() {
        List<EntryFormatter> entryFormatters = new ArrayList<EntryFormatter>();
        entryFormatters.add(new DefaultEntryFormatter(this));
        entryFormatters.add(new NgxBlockFormatter(this));
        setFormatters(entryFormatters);
    }

    public void setFormatters(Collection<EntryFormatter> formatters) {
        indentSettableFormatters = new HashMap<NgxEntryType, IndentSettableEntryFormatter>();
        innerFormatters = new HashMap<NgxEntryType, EntryFormatter>();
        for (EntryFormatter formatter : formatters) {
            for (NgxEntryType entryType : formatter.supportedEntryTypes()) {
                putFormatter(entryType, formatter);
            }
        }
    }

    public void putFormatter(NgxEntryType entryType, EntryFormatter formatter) {
        innerFormatters.put(entryType, formatter);
        if (formatter instanceof IndentSettableEntryFormatter) {
            indentSettableFormatters.put(entryType, ((IndentSettableEntryFormatter) formatter).copy());
        }
    }

    public EntryFormatter getFormatter(Class<? extends NgxEntry> formatterClazz) {
        NgxEntryType entryType = NgxEntryType.fromClass(formatterClazz);
        return getFormatter(entryType);
    }

    public EntryFormatter getFormatter(NgxEntryType entryType) {
        if (entryType != null) {
            EntryFormatter formatter = innerFormatters.get(entryType);
            if (formatter != null) {
                return formatter;
            }
        }
        return NULL_INDENT_SETTABLE_FORMATTER;
    }

    public IndentSettableEntryFormatter getIndentSettableEntryFormatter(Class<? extends NgxEntry> formatterClazz) {
        NgxEntryType entryType = NgxEntryType.fromClass(formatterClazz);
        return getIndentSettableEntryFormatter(entryType);
    }

    public IndentSettableEntryFormatter getIndentSettableEntryFormatter(NgxEntryType entryType) {
        if (entryType != null) {
            IndentSettableEntryFormatter formatter = indentSettableFormatters.get(entryType);
            if (formatter != null) {
                return formatter.copy();
            }
        }
        return null;
    }

    private static class NullEntryFormatter implements EntryFormatter {

        @Override
        public StringBuffer formattedText(NgxEntry entry) {
            return new StringBuffer();
        }

        @Override
        public NgxEntryType[] supportedEntryTypes() {
            return new NgxEntryType[] {};
        }

    }

}
