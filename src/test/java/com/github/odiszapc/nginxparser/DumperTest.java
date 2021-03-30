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
import org.junit.Test;

public class DumperTest {

    @Test
    public void testC1() throws Exception {
        final String expected = "" +
                "user nginx;\n" +
                "worker_processes 2;\n" +
                "timer_resolution 100ms;\n" +
                "worker_rlimit_nofile 8192;\n" +
                "worker_priority -10;\n";
        Assert.assertEquals(expected, TestUtils.dump("common/c1.conf"));
    }

    @Test
    public void testC2() throws Exception {
        final String expected = "" +
                "error_log /var/log/nginx/error.log warn;\n" +
                "pid /var/run/nginx.pid;\n" +
                "events {\n" +
                "  worker_connections 2048;\n" +
                "  use epoll;\n" +
                "}\n";
        Assert.assertEquals(expected, TestUtils.dump("common/c2.conf"));
    }

    @Test
    public void testC3() throws Exception {
        final String expected = "" +
                "user nginx;\n" +
                "#worker_processes  2;\n" +
                "worker_priority -10;\n" +
                "proxy_pass http://unix:/opt/apps/ipn/ipn.sock:/;\n";
        Assert.assertEquals(expected, TestUtils.dump("common/c3.conf"));
    }

    @Test
    public void testC8() throws Exception {
        final String expected = "" +
                "server {\n" +
                "  if ($host == test.example.com) {\n" +
                "    return 301 https://$host$request_uri;\n" +
                "  }\n" +
                "  # managed by certbot\n" +
                ""+
                "  listen 80;\n" +
                "  return 404;\n" +
                "  # managed by Certbot\n" +
                "}\n" +
                "\n" +
                "server {\n" +
                "  server_name test.example.com;\n" +
                "  location / {\n" +
                "    proxy_pass http://localhost:8080;\n" +
                "  }\n" +
                "  listen 443 ssl;\n" +
                "  # managed by Certbot\n" +
                "  ssl_certificate /etc/letsencrypt/live/example.com/fullchain.pem;\n" +
                "  # managed by Certbot\n" +
                "  ssl_certificate_key /etc/letsencrypt/live/example.com/privkey.pem;\n" +
                "  # managed by Certbot\n" +
                "  include /etc/letsencrypt/options-ssl-nginx.conf;\n" +
                "  # managed by Certbot\n" +
                "  ssl_dhparam /etc/letsencrypt/ssl-dhparams.pem;\n" +
                "  # managed by Certbot\n" +
                "}\n";
        Assert.assertEquals(expected, TestUtils.dump("common/c8.conf"));
    }
}
