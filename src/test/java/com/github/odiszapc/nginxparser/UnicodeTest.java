package com.github.odiszapc.nginxparser;

import org.junit.Test;

import java.util.Iterator;

public class UnicodeTest extends ParseTestBase {

    @Test
    public void i18nTest() throws Exception {
        final NgxConfig parsedConfig = parse("i18n/c1.conf");
        Iterator<NgxEntry> it = parsedConfig.getEntries().iterator();
        NgxBlock i18n = (NgxBlock) it.next();
        TestUtils.assertBlock(i18n, "i18n");

        final Iterator<NgxEntry> i18nEntries = i18n.getEntries().iterator();
        final NgxBlock tr = (NgxBlock)i18nEntries.next();
        TestUtils.assertBlock(tr, "tr");
        TestUtils.assertParam(tr.getEntries().iterator().next(), "sign-up", "Kayıt", "Ol");
        final NgxBlock en = (NgxBlock) i18nEntries.next();
        TestUtils.assertBlock(en, "en");
        TestUtils.assertParam(en.getEntries().iterator().next(), "sign-up", "Sign-up");
    }
}
