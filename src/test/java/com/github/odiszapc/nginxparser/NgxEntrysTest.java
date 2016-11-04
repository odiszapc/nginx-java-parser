package com.github.odiszapc.nginxparser;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class NgxEntrysTest {

    @Test
    public void testParse() {
        Server testObj = new Server();
        testObj.realm = "*";
        testObj.listen = "80";
        testObj.serverName = "localhost";
        NgxEntry result = NgxEntrys.parse(testObj);
        TestUtils.assertBlock(result, "server", testObj.realm);
        NgxBlock resultBlock = (NgxBlock) result;
        Collection<NgxEntry> resultEntrys = resultBlock.getEntries();
        Assert.assertEquals(resultEntrys.size(), 2);
        for (NgxEntry entry : resultEntrys) {
            Assert.assertTrue(entry instanceof NgxParam);
        }
    }

    static class Server {

        @NgxTokenValue
        public String realm;

        public String listen;
        public String serverName;
    }
}
