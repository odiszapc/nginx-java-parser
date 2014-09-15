package com.github.odiszapc.nginxparser;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

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
}
