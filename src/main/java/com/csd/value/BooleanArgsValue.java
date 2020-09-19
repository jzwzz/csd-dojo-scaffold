package com.csd.value;

public class BooleanArgsValue extends CommonArgsValue {
    public BooleanArgsValue() {
        // empty
    }

    protected BooleanArgsValue(String flag) {
        super(flag);
        setValue(true);
    }

    public void parseValue(String value) {
        setValue(Boolean.valueOf(value));
    }

    @Override
    public CommonArgsValue newValueByFlag(String flag) {
        return new BooleanArgsValue(flag);
    }
}
