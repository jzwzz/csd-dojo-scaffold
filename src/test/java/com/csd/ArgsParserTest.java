package com.csd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArgsParserTest {
    @Test
    public void test_should_given_values_size_given_params() {

        assertResult(
                new ArgsParser(
                        new Schemas("l:boolean p:integer d:string"),
                        new String[] {"-l", "-p", "8080", "-d", "/usr/logs"}));
    }

    private void assertResult(ArgsParser argsParser) {
        assertThat(argsParser.getValue("l"), is(true));
        assertThat(argsParser.getValue("p"), is(8080));
        assertThat(argsParser.getValue("d"), is("/usr/logs"));
    }
}
