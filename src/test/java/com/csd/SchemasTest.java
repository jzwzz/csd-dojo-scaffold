package com.csd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchemasTest {
    @Test
    public void should_return_schema_given_schema_str() {
        String schemaStr = "l:boolean p:integer d:string";
        Schemas schemas = new Schemas(schemaStr);
        assertThat(schemas.size(), is(3));
    }

    @Test
    public void should_return_schema_type_given_schema_str() {
        String schemaStr = "l:boolean p:integer d:string";
        Schemas schemas = new Schemas(schemaStr);
        assertThat(schemas.getType("l"), is("boolean"));
        assertThat(schemas.getType("p"), is("integer"));
        assertThat(schemas.getType("d"), is("string"));
    }
}
