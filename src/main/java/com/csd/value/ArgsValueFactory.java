package com.csd.value;

import com.csd.exception.UnknownTypeException;

import java.util.HashMap;
import java.util.Map;

public class ArgsValueFactory {
    private ArgsValueFactory() {
        // empty
    }

    public static CommonArgsValue getArgsValue(final String flag, final String type) {
        if (!isCorrectType(type)) {
            throw new UnknownTypeException("un known type " + type);
        }
        return getCommonArgsValue(flag, type);
    }

    private static CommonArgsValue getCommonArgsValue(final String flag, final String type) {
        Map<String, CommonArgsValue> dataTypeMap = getDataTypeMap();
        return dataTypeMap.get(type).newValueByFlag(flag);
    }

    private static Map<String, CommonArgsValue> getDataTypeMap() {
        Map<String, CommonArgsValue> map = new HashMap<>();
        map.put("boolean", new BooleanArgsValue());
        map.put("integer", new IntegerArgsValue());
        map.put("string", new StringArgsValue());
        return map;
    }

    private static boolean isCorrectType(String type) {

        return getDataTypeMap().containsKey(type);
    }
}
