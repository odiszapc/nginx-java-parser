package com.github.odiszapc.nginxparser;

import org.junit.Test;

public class RewriteTest extends ParseTestBase {

    @Test
    public void testC1() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c1.conf"), "rewrite", "^/dashboard$", "/admin.php?controller=user&action=login", "last");
    }

    @Test
    public void testС2() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c2.conf"), "rewrite", "^/feed", "/feed.php", "last");
    }

    @Test
    public void testС3() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c3.conf"), "rewrite", "^/category/([^/]+)/page-([0-9]+)$", "/index.php?controller=blog&action=view&category=$1&page=$2", "last");
    }

    @Test
    public void testС4() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c4.conf"), "rewrite", "^/category/([^/]+)/$", "/index.php?controller=blog&action=view&category=$1&page=0", "last");
    }

    @Test
    public void testС5() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c5.conf"), "rewrite", "^/page-([0-9]+)$", "/index.php?controller=blog&action=view&page=$1", "last");
    }

    @Test
    public void testС6() throws Exception {
        TestUtils.assertParam(getFirstParam("rewrite/c6.conf"), "rewrite", "^", "/index.php?controller=post&action=view&id_post=$1", "last");
    }
}
