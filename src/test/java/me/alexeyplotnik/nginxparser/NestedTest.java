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

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class NestedTest {

    @Test
    public void testС1() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("nested/c1.conf").getEntries().iterator();
        NgxBlock rtmp = TestUtils.assertBlock(it.next(), "rtmp");

        it = rtmp.iterator();
        NgxBlock server = TestUtils.assertBlock(it.next(), "server");
        Iterator<NgxEntry> serverIt = server.iterator();
        TestUtils.assertParam(serverIt.next(), "listen", "1935");
        NgxBlock application = TestUtils.assertBlock(serverIt.next(), "application", "myapp");
        Iterator<NgxEntry> appIt = application.iterator();
        TestUtils.assertParam(appIt.next(), "live", "on");

        server = TestUtils.assertBlock(it.next(), "server");
        serverIt = server.iterator();
        TestUtils.assertParam(serverIt.next(), "listen", "1936");
        application = TestUtils.assertBlock(serverIt.next(), "application", "myapp2");
        appIt = application.iterator();
        TestUtils.assertParam(appIt.next(), "live", "off");

        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC1find() throws Exception {
        NgxConfig conf = TestUtils.parse("nested/c1.conf");
        List<NgxEntry> result = conf.findAll(NgxConfig.PARAM, "rtmp", "server", "application", "live");
        Assert.assertEquals(result.size(), 2);
        TestUtils.assertParam(result.get(0), "live", "on");
        TestUtils.assertParam(result.get(1), "live", "off");
        Assert.assertNotEquals(result.get(0), result.get(1));
    }

    @Test
    public void testC1findEvery() throws Exception {
        NgxConfig conf = TestUtils.parse("nested/c1.conf");
        NgxBlock rtmp = conf.findBlock("rtmp");
        TestUtils.assertBlock(rtmp, "rtmp");

        List<NgxEntry> all = conf.findAll(NgxConfig.BLOCK, "rtmp", "server");
        Iterator<NgxEntry> it = all.iterator();
        NgxBlock s1 = (NgxBlock) it.next();
        TestUtils.assertBlock(s1, "server");
        NgxParam param = s1.findParam("application", "live");
        TestUtils.assertParam(param, "live");
        Assert.assertEquals(param.getValue(), "on");

        NgxBlock s2 = (NgxBlock) it.next();
        TestUtils.assertBlock(s2, "server");
        NgxParam param2 = s2.findParam("application", "live");
        TestUtils.assertParam(param2, "live");
        Assert.assertEquals(param2.getValue(), "off");
    }

    @Test
    public void testC1findBlock() throws Exception {
        NgxConfig conf = TestUtils.parse("nested/c1.conf");
        List<NgxEntry> result = conf.findAll(NgxConfig.BLOCK, "rtmp", "server", "application");
        Assert.assertEquals(result.size(), 2);
        TestUtils.assertBlock(result.get(0), "application", "myapp");
        TestUtils.assertBlock(result.get(1), "application", "myapp2");
        Assert.assertNotEquals(result.get(0), result.get(1));
    }
}
