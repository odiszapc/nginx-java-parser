package com.github.odiszapc.nginxparser;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class ComplexTest extends ParseTestBase {
    @Test
    public void testC1() throws Exception {
        Iterator<NgxEntry> it = parse("complex/c1.conf").getEntries().iterator();
        NgxBlock loc = (NgxBlock) it.next();
        TestUtils.assertBlock(loc, "location", "~", "^/cat/(.*)^/cat(_)");
        Assert.assertTrue(loc.getEntries().isEmpty());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testC2() throws Exception {
        Iterator<NgxEntry> it = parse("complex/c2.conf").getEntries().iterator();
        NgxBlock loc = (NgxBlock) it.next();
        TestUtils.assertBlock(loc, "location", "~", "\\.(gif|png|jpe?g)$");
        Assert.assertTrue(loc.getEntries().isEmpty());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testHashSymbols() throws Exception {
        final NgxConfig parsedConfig = parse("complex/nginx-hash-symbols.conf");
        NgxDumper ngxDumper = new NgxDumper(parsedConfig);
        ngxDumper.dump(System.out);

        List<NgxEntry> server = parsedConfig.findAll(NgxConfig.BLOCK, "http", "server");
        Assert.assertNotNull(server.get(0));
    }

    @Test
    public void mapWithRegexps() throws Exception {
        final NgxConfig parsedConfig = parse("complex/map_regexps.conf");
        NgxDumper ngxDumper = new NgxDumper(parsedConfig);
        ngxDumper.dump(System.out);

        Iterator<NgxEntry> it = parsedConfig.getEntries().iterator();
        NgxBlock map = (NgxBlock) it.next();
        TestUtils.assertBlock(map, "map", "$request_uri", "$site_redirect");

        Assert.assertEquals(6, map.getEntries().size());
        final Iterator<NgxEntry> mapEntries = map.getEntries().iterator();
        TestUtils.assertParam(mapEntries.next(), "default", "no_match");
        TestUtils.assertParam(mapEntries.next(), "~*^/foo/?$", "http://example.com/foo.html");
        TestUtils.assertParam(mapEntries.next(), "~^/(?i)bar/?$", "http://example.com/#!/register/1?corporate=BAR");
        TestUtils.assertParam(mapEntries.next(), "\"~^/(?i)bar/?$\"", "http://example.com/#!/register/1?corporate=BAR");
        // Basically it's invalid regexp, it actually not a regexp
        // See: http://nginx.org/en/docs/http/ngx_http_map_module.html
        // Each regexp must be prefixed by ~ or ~*
        TestUtils.assertParam(mapEntries.next(), "\"^/(?i)bar/?$\"", "http://example.com/#!/register/1?corporate=BAR");
        TestUtils.assertParam(mapEntries.next(), "~^/(?i)baz/?$", "http://example.com/baz.html");
    }

    @Test
    @Ignore("Semicolon is broken")
    public void semicolon() throws Exception {
        final NgxConfig parsedConfig = parse("complex/semicolon.conf");
        NgxDumper ngxDumper = new NgxDumper(parsedConfig);
        ngxDumper.dump(System.out);

        Iterator<NgxEntry> it = parsedConfig.getEntries().iterator();
        NgxBlock loc = (NgxBlock) it.next();
        TestUtils.assertBlock(loc, "location", "~*", "(^.+\\.(xhtml)(;.?))");
        Assert.assertEquals(1, loc.getEntries().size());
        Assert.assertFalse(it.hasNext());
    }
}
