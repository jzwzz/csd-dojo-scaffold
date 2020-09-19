package com.csd.value;

public abstract class CommonArgsValue {

    private String flag;
    private Object value;

    protected CommonArgsValue() {
        // empty
    }

    protected CommonArgsValue(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }

    protected void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CommonArgsValue{" + "flag='" + flag + '\'' + ", value='" + value + '\'' + '}';
    }

    public abstract void parseValue(String value);

    public abstract CommonArgsValue newValueByFlag(String flag);
}
