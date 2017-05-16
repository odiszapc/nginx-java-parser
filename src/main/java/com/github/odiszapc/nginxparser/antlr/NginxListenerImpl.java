package com.github.odiszapc.nginxparser.antlr;

import com.github.odiszapc.nginxparser.NgxConfig;



public class NginxListenerImpl extends NginxBaseListener {

    private NgxConfig result;

    public NgxConfig getResult() {
        return result;
    }

    @Override
    public void enterConfig(NginxParser.ConfigContext ctx) {
        result = ctx.ret;
    }
}
