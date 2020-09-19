package com.csd.value;

public class StringArgsValue extends CommonArgsValue {
    public StringArgsValue() {
        // empty
    }

    public StringArgsValue(String flag) {
        super(flag);
    }

    @Override
    public void parseValue(String value) {
        setValue(value);
    }

    @Override
    public CommonArgsValue newValueByFlag(String flag) {
        return new StringArgsValue(flag);
    }
}
