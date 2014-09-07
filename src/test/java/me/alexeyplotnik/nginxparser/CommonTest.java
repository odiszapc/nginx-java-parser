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

import static me.alexeyplotnik.nginxparser.TestUtils.assertBlock;
import static me.alexeyplotnik.nginxparser.TestUtils.assertComment;
import static me.alexeyplotnik.nginxparser.TestUtils.assertParam;

public class CommonTest {

    @Test
    public void testC1() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c1.conf").getEntries().iterator();

        assertParam(it.next(), "user", "nginx");
        assertParam(it.next(), "worker_processes", "2");
        assertParam(it.next(), "timer_resolution", "100ms");
        assertParam(it.next(), "worker_rlimit_nofile", "8192");
        assertParam(it.next(), "worker_priority", "-10");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC2() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c2.conf").getEntries().iterator();
        assertParam(it.next(), "error_log", "/var/log/nginx/error.log", "warn");
        assertParam(it.next(), "pid", "/var/run/nginx.pid");
        NgxBlock events = assertBlock(it.next(), "events");
        Iterator<NgxEntry> eventsIt = events.getEntries().iterator();
        assertParam(eventsIt.next(), "worker_connections", "2048");
        assertParam(eventsIt.next(), "use", "epoll");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC3() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c3.conf").getEntries().iterator();

        assertParam(it.next(), "user", "nginx");
        assertComment(it.next(), "worker_processes  2;");
        assertParam(it.next(), "worker_priority", "-10");
        assertParam(it.next(), "proxy_pass", "http://unix:/opt/apps/ipn/ipn.sock:/");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC4() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c4.conf").getEntries().iterator();

        assertBlock(it.next(), "location", "@backend");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC5() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c5.conf").getEntries().iterator();

        assertBlock(it.next(), "location", "~", "/\\.");
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC6() throws Exception {
        Iterator<NgxEntry> it = TestUtils.parse("common/c6.conf").getEntries().iterator();

        assertBlock(it.next(), "location", "~*", "\\.(?:ico|css|js|gif|jpe?g|png)$");
        Assert.assertFalse(it.hasNext());
    }
}
