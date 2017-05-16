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

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static com.github.odiszapc.nginxparser.TestUtils.assertBlock;
import static com.github.odiszapc.nginxparser.TestUtils.assertParam;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class NestedTest extends ParseTestBase {

    @Test
    public void testС1() throws Exception {
        Iterator<NgxEntry> it = parse("nested/c1.conf").getEntries().iterator();
        NgxBlock rtmp = assertBlock(it.next(), "rtmp");

        it = rtmp.iterator();
        NgxBlock server = assertBlock(it.next(), "server");
        Iterator<NgxEntry> serverIt = server.iterator();
        assertParam(serverIt.next(), "listen", "1935");
        NgxBlock application = assertBlock(serverIt.next(), "application", "myapp");
        Iterator<NgxEntry> appIt = application.iterator();
        assertParam(appIt.next(), "live", "on");

        server = assertBlock(it.next(), "server");
        serverIt = server.iterator();
        assertParam(serverIt.next(), "listen", "1936");
        application = assertBlock(serverIt.next(), "application", "myapp2");
        appIt = application.iterator();
        assertParam(appIt.next(), "live", "off");

        assertFalse(it.hasNext());
    }

    @Test
    public void testC1find() throws Exception {
        NgxConfig conf = parse("nested/c1.conf");
        List<NgxEntry> result = conf.findAll(NgxConfig.PARAM, "rtmp", "server", "application", "live");
        assertEquals(result.size(), 2);
        assertParam(result.get(0), "live", "on");
        assertParam(result.get(1), "live", "off");
        assertNotEquals(result.get(0), result.get(1));
    }

    @Test
    public void testC1findEvery() throws Exception {
        NgxConfig conf = parse("nested/c1.conf");
        NgxBlock rtmp = conf.findBlock("rtmp");
        assertBlock(rtmp, "rtmp");

        List<NgxEntry> all = conf.findAll(NgxConfig.BLOCK, "rtmp", "server");
        Iterator<NgxEntry> it = all.iterator();
        NgxBlock s1 = (NgxBlock) it.next();
        assertBlock(s1, "server");
        NgxParam param = s1.findParam("application", "live");
        assertParam(param, "live");
        assertEquals(param.getValue(), "on");

        NgxBlock s2 = (NgxBlock) it.next();
        assertBlock(s2, "server");
        NgxParam param2 = s2.findParam("application", "live");
        assertParam(param2, "live");
        assertEquals(param2.getValue(), "off");
    }

    @Test
    public void testC1findBlock() throws Exception {
        NgxConfig conf = parse("nested/c1.conf");
        List<NgxEntry> result = conf.findAll(NgxConfig.BLOCK, "rtmp", "server", "application");
        assertEquals(result.size(), 2);
        assertBlock(result.get(0), "application", "myapp");
        assertBlock(result.get(1), "application", "myapp2");
        assertNotEquals(result.get(0), result.get(1));
    }

    @Test
    public void testС2() throws Exception {
        NgxConfig conf = parse("nested/c2.conf");
        NgxBlock loc = assertBlock(conf.findBlock("http", "server", "location"), "location", "/hello");
        Iterator<NgxEntry> it = loc.iterator();
        assertParam(it.next(), "set", "$memc_cmd", "$arg_cmd");
        assertParam(it.next(), "set_unescape_uri", "$name", "$arg_name");
        assertParam(it.next(), "set_if_empty", "$name", "\"Anonymous\"");
        assertParam(it.next(), "memc_pass", "127.0.0.1:11211");
    }

    @Test
    public void testС5() throws Exception {
        NgxConfig conf = parse("nested/c5.conf");
        NgxBlock loc = assertBlock(conf.findBlock("http", "server", "location"), "location", "/foo");
        Iterator<NgxEntry> it = loc.iterator();
        NgxEntry entry = it.next();
        assertTrue(entry instanceof NgxParam);
        assertEquals(((NgxParam) entry).getName(), "stub_status");
        assertEquals(0, ((NgxParam) entry).getValues().size());
        assertEquals("", ((NgxParam) entry).getValue());
    }
}
