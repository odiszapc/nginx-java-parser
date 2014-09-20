package com.github.odiszapc.nginxparser;

import java.util.Iterator;

public class ParseTestBase {
    protected NgxConfig parse(String path) throws Exception {
        return TestUtils.parseAntlr(path);
    }

    protected NgxEntry getFirstParam(String path) throws Exception {
        Iterator<NgxEntry> it = parse(path).getEntries().iterator();
        return it.next();
    }
}
