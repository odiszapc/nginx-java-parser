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

package me.alexeyplotnik.nginxparser;

import me.alexeyplotnik.nginxparser.parser.NginxConfigParser;
import me.alexeyplotnik.nginxparser.parser.ParseException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/**
 * Main class that describes Nginx config
 */
public class NgxConfig extends NgxBlock {

    public static final Class<? extends NgxEntry> PARAM = NgxParam.class;
    public static final Class<? extends NgxEntry> COMMENT = NgxComment.class;
    public static final Class<? extends NgxEntry> BLOCK = NgxBlock.class;
    public static final Class<? extends NgxEntry> IF = NgxIfBlock.class;

    /**
     * Parse an existing config
     *
     * @param path Path to config file
     * @return Config object
     * @throws IOException
     * @throws ParseException
     */
    public static NgxConfig read(String path) throws IOException, ParseException {
        FileInputStream input = new FileInputStream(path);
        NginxConfigParser parser = new NginxConfigParser(input);
        return parser.parse();
    }

    /**
     * Read config from existing stream
     * @param input stream to read from
     * @return Config object
     * @throws IOException
     * @throws ParseException
     */
    public static NgxConfig read(InputStream input) throws IOException, ParseException {
        NginxConfigParser parser = new NginxConfigParser(input);
        return parser.parse();
    }

    @Override
    public Collection<NgxToken> getTokens() {
        throw new NotImplementedException();
    }

    @Override
    public void addValue(NgxToken token) {
        throw new NotImplementedException();
    }

    public String toString() {
        return "Nginx Config (" + getEntries().size() + " entries)";
    }

}
