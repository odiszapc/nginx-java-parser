package com.github.odiszapc.common.formatter;

import com.github.odiszapc.nginxparser.NgxEntry;

public abstract class IndentSettableEntryFormatter implements EntryFormatter {

    public static final int DEFAULT_INDENT = 4;
    private int indent = DEFAULT_INDENT;
    private FormatterRepository repository;

    public IndentSettableEntryFormatter(IndentSettableEntryFormatter formatter) {
        this(formatter.repository);
        this.indent = formatter.indent;
    }

    public IndentSettableEntryFormatter(FormatterRepository repository) {
        this.repository = repository;
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

    public int getIndent() {
        return indent;
    }

    protected EntryFormatter getFormatter(Class<? extends NgxEntry> formatterClazz) {
        IndentSettableEntryFormatter insFormatter = repository.getIndentSettableEntryFormatter(formatterClazz);
        if (insFormatter != null) {
            insFormatter.setIndent(indent + insFormatter.indent);
            return insFormatter;
        }
        return repository.getFormatter(formatterClazz);
    }

    public StringBuffer indentText() {
        StringBuffer indentBuf = new StringBuffer();
        for (int i = 0; i < indent; i++) {
            indentBuf.append(' ');
        }
        return indentBuf;
    }

    @Override
    public StringBuffer formattedText(NgxEntry entry) {
        StringBuffer buf = new StringBuffer();
        buf.append(indentText());
        buf.append(entry.toString());
        buf.append('\n');
        return buf;
    }

    public abstract IndentSettableEntryFormatter copy();
}
