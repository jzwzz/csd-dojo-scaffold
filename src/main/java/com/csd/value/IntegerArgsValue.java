package com.csd.value;

public class IntegerArgsValue extends CommonArgsValue {

    public IntegerArgsValue() {
        // empty
    }

    public IntegerArgsValue(String flag) {
        super(flag);
    }

    @Override
    public void parseValue(String value) {
        setValue(Integer.parseInt(value));
    }

    @Override
    public CommonArgsValue newValueByFlag(String flag) {
        return new IntegerArgsValue(flag);
    }
}
