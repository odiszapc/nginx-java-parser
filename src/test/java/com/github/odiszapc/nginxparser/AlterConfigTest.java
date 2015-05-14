package com.github.odiszapc.nginxparser;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlterConfigTest extends ParseTestBase {
    @Test
    public void removeOneLocation() throws Exception {
        NgxConfig conf = parse("nested/c2.conf");
        NgxEntry ngxEntry = conf.find(NgxConfig.BLOCK, "http", "server", "location");
        conf.remove(ngxEntry);

        final String expected = "" +
                "http {\n" +
                "  server {\n" +
                "  }\n" +
                "}\n";

        assertEquals(new NgxDumper(conf).dump(), expected);
    }

    @Test
    public void removeManyLocations() throws Exception {
        NgxConfig conf = parse("nested/c4.conf");
        List<NgxEntry> locations = conf.findAll(NgxConfig.BLOCK, "http", "server", "location");
        assertEquals(2, locations.size());
        conf.removeAll(locations);
        assertEquals(0, conf.findAll(NgxConfig.BLOCK, "http", "server", "location").size());

        final String expected = "" +
                "http {\n" +
                "  server {\n" +
                "  }\n" +
                "}\n";

        assertEquals(new NgxDumper(conf).dump(), expected);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void removeNullElement() throws Exception {
        expectedEx.expect(NullPointerException.class);
        expectedEx.expectMessage("Item can not be null");

        NgxConfig conf = parse("nested/c4.conf");
        conf.remove(null);
    }

    @Test
    public void removeNullElements() throws Exception {
        expectedEx.expect(NullPointerException.class);
        expectedEx.expectMessage("Items can not be null");

        NgxConfig conf = parse("nested/c4.conf");
        conf.removeAll(null);
    }
}
