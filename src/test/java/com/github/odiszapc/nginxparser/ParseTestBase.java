package com.github.odiszapc.nginxparser;

public class ParseTestBase {
    protected NgxConfig parse(String path) throws Exception {
        return TestUtils.parseAntlr(path);
    }
}
