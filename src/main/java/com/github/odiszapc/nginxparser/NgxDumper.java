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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

/**
 * NgxDumper is used to serialize an existing or manually created NgxConfig object
 */
public class NgxDumper {

    private NgxConfig config;

    public NgxDumper(NgxConfig config) {
        this.config = config;
    }

    /**
     * Dump the content of the config to a file.
     *
     * This method is used to write the NgxConfig directly to a file.
     *
     * If the file does not exist, it will be created.
     *
     * @param path the {@link Path} the config should be written to
     * @throws IOException if anything goes wrong while writing or if the file is not writable
     */
    public void dumpToFile(Path path) throws IOException {
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
        if(!Files.isWritable(path)) {
            throw new IOException("The file cannot be written to: " + path);
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        dump(outputStream);
        Files.write(path, outputStream.toByteArray(), StandardOpenOption.TRUNCATE_EXISTING);
    }

    /**
     * Dump the content of the config to a file.
     *
     * This method is for convenience and redirects directly to {@link #dumpToFile(Path)}
     *
     * @param destination the file the config should be written to
     * @throws IOException if anything goes wrong while writing
     * @see #dumpToFile(Path)
     */
    public void dumpToFile(String destination) throws IOException {
        dumpToFile(Paths.get(destination));
    }

    /**
     * Converts config int String
     *
     * @return Serialized config
     */
    public String dump() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        writeToStream(config, outputStream);
        return outputStream.toString();
    }

    /**
     * Serializes config and sends result to the provided OutputStream
     *
     * @param out stream to write to
     */
    public void dump(OutputStream out) {
        writeToStream(config, out);
    }

    private void writeToStream(NgxBlock config, OutputStream outputStream) {
        try (NgxPrintWriter writer = new NgxPrintWriter(outputStream)) {
            Iterator<NgxEntry> iterator = config.iterator();
            while (iterator.hasNext()) {
                NgxEntry current = iterator.next();
                current.write(writer);
                if (current instanceof NgxBlock && iterator.hasNext()) {
                    // Extra new line, between two top level blocks
                    writer.newLine();
                }
            }
        } catch (Exception e) {
            // TODO Better Exception handling, like custom Exception types within a custom hierarchy
            throw new IllegalStateException(e);
        }
    }
}
