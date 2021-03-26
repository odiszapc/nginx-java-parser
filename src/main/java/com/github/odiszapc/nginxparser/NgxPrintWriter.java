package com.github.odiszapc.nginxparser;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collection;

public class NgxPrintWriter implements AutoCloseable {

    private final static String PAD_SYMBOL = "  ";
    private final static String LBRACE = "{";
    private final static String RBRACE = "}";
    private final static String LF = "\n";
    private final PrintWriter printWriter;
    private int level = 0;

    public NgxPrintWriter(OutputStream outputStream) {
        this.printWriter = new PrintWriter(outputStream);
    }

    public NgxPrintWriter openBlock(String prefix) {
        append(prefix);
        printWriter.append(" ").append(LBRACE);
        level += 1;

        return newLine();
    }

    public NgxPrintWriter closeBlock() {
        level -= 1;
        append(RBRACE);

        return newLine();
    }

    public NgxPrintWriter newLine() {
        printWriter.append(LF);

        return this;
    }

    public NgxPrintWriter append(String string) {
        this.printWriter.append(constructOffset(level))
                .append(string);

        return this;
    }

    public NgxPrintWriter appendLine(String string) {
        this.printWriter.append(constructOffset(level))
                .append(string)
                .append(LF);

        return this;
    }

    public NgxPrintWriter write(Collection<NgxEntry> entries) {
        for (NgxEntry entry : entries) {
            entry.write(this);
        }

        return this;
    }

    public void flush() {
        printWriter.flush();
    }

    private String constructOffset(int level) {
        StringBuilder offset = new StringBuilder();
        for (int i = 0; i < level; i++) {
            offset.append(PAD_SYMBOL);
        }
        return offset.toString();
    }

    @Override
    public void close() {
        printWriter.close();
    }
}
