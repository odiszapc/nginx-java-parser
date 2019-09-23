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

import org.junit.Assert;

import java.io.InputStream;
import java.util.Iterator;

public class TestUtils {
    public static NgxConfig parseJavaCC(String path) throws Exception {
        InputStream input = getStream(path);
        return NgxConfig.readJavaCC(input);
    }

    public static NgxConfig parseAntlr(String path) throws Exception {
        return NgxConfig.read(getStream(path));
    }

    public static InputStream getStream(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

    public static String dump(String path) throws Exception {
        NgxConfig conf = TestUtils.parseAntlr(path);
        NgxDumper dumper = new NgxDumper(conf);
        return dumper.dump();
    }

    public static void assertParam(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxParam);
        Assert.assertEquals(((NgxParam) entry).getName(), name);

        Iterator<String> it = ((NgxParam) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next().replaceAll("\r\n?","\n"), value);
        }

    }

    public static NgxBlock assertBlock(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxBlock);
        Assert.assertEquals(((NgxBlock) entry).getName(), name);

        Assert.assertEquals(values.length, ((NgxBlock) entry).getValues().size());
        Iterator<String> it = ((NgxBlock) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next(), value);
        }

        return (NgxBlock) entry;
    }

    public static NgxIfBlock assertIfBlock(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxBlock);
        Assert.assertEquals(((NgxIfBlock) entry).getName(), name);

        Assert.assertEquals(values.length, ((NgxBlock) entry).getValues().size());
        Iterator<String> it = ((NgxBlock) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next(), value);
        }

        return (NgxIfBlock) entry;
    }

    @SuppressWarnings("UnusedReturnValue")
    public static NgxComment assertComment(NgxEntry entry, @SuppressWarnings("SameParameterValue") String value) {
        Assert.assertTrue(entry instanceof NgxComment);
        Assert.assertEquals(((NgxComment) entry).getValue(), value);
        return (NgxComment) entry;
    }
}
