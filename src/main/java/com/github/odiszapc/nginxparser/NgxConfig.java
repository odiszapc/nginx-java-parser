/*
 * Copyright 2014 Alexey Plotnik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.odiszapc.nginxparser;

import com.github.odiszapc.common.formatter.EntryFormatter;
import com.github.odiszapc.common.formatter.FormatterRepository;
import com.github.odiszapc.common.formatter.IndentSettableEntryFormatter;
import com.github.odiszapc.nginxparser.antlr.NginxLexer;
import com.github.odiszapc.nginxparser.antlr.NginxListenerImpl;
import com.github.odiszapc.nginxparser.antlr.NginxParser;
import com.github.odiszapc.nginxparser.javacc.NginxConfigParser;
import com.github.odiszapc.nginxparser.javacc.ParseException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/**
 * Main class that describes Nginx config
 */
public class NgxConfig extends NgxBlock {

    public static final Class<? extends NgxEntry> PARAM = NgxParam.class;
    public static final Class<? extends NgxEntry> COMMENT = NgxComment.class;
    public static final Class<? extends NgxEntry> BLOCK = NgxBlock.class;
    public static final Class<? extends NgxEntry> IF = NgxIfBlock.class;

    private FormatterRepository formatterRespository = new FormatterRepository();

    /**
     * Parse an existing config
     *
     * @param path Path to config file
     * @return Config object
     * @throws IOException
     */
    public static NgxConfig read(String path) throws IOException {
        FileInputStream input = new FileInputStream(path);
        return read(input);
    }

    public static NgxConfig read(InputStream in) throws IOException {
        return readAntlr(in);
    }

    /**
     * Read config from existing stream
     * @param input stream to read from
     * @return Config object
     * @throws IOException
     * @throws ParseException
     */
    public static NgxConfig readJavaCC(InputStream input) throws IOException, ParseException {
        NginxConfigParser parser = new NginxConfigParser(input);
        return parser.parse();
    }

    public static NgxConfig readAntlr(InputStream in) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(in);
        NginxLexer lexer = new NginxLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NginxParser parser = new NginxParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        ParseTree tree = parser.config(); // begin parsing at init rule
        NginxListenerImpl listener = new NginxListenerImpl();
        walker.walk(listener, tree);

        return listener.getResult();
    }

    public void setFormatterRepository(FormatterRepository formatterRespository) {
        this.formatterRespository = formatterRespository;
    }

    @Override
    public Collection<NgxToken> getTokens() {
        throw new IllegalStateException("Not implemented");
    }

    @Override
    public void addValue(NgxToken token) {
        throw new IllegalStateException("Not implemented");
    }

    @Override
    public String toString() {
        return "#Nginx Config (" + getEntries().size() + " entries)";
    }

    public void writeTo(File file) throws IOException {
        EntryFormatter formatter = formatterRespository.getFormatter(NgxConfig.class);
        if (formatter instanceof IndentSettableEntryFormatter) {
            ((IndentSettableEntryFormatter) formatter).setIndent(0);
        }
        StringBuffer buffer = formatter.formattedText(this);
        FileUtils.write(file, buffer, StandardCharsets.UTF_8);
    }
}
