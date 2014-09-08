package com.github.odiszapc.nginxparser;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Collection;

@Ignore
public class ComplexTest {
    @Test
    public void testC1() throws Exception {
        NgxConfig parse = TestUtils.parse("complex/c1.conf");
        Collection<NgxToken> tokens = ((NgxBlock) parse.iterator().next()).getTokens();
    }

    @Test
    public void testC2() throws Exception {
        NgxConfig parse = TestUtils.parse("complex/c2.conf");
    }
}
