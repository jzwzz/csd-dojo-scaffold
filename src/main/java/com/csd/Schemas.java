package com.csd;

import java.util.HashMap;
import java.util.Map;

public class Schemas {

    private String schemaStr;
    private Map<String, String> typeMap;

    public Schemas(String schemaStr) {
        this.schemaStr = schemaStr;
        this.typeMap = initTypeMap(schemaStr, new HashMap<>());
    }

    private Map<String, String> initTypeMap(String schemaStr, HashMap<String, String> map) {
        for (String value : schemaStr.split(" ")) {
            String[] values2 = value.split(":");
            map.put(values2[0], values2[1]);
        }
        return map;
    }

    public int size() {
        return schemaStr.split(" ").length;
    }

    public String getType(String flag) {
        return typeMap.get(flag);
    }
}
