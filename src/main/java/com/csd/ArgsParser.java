package com.csd;

import com.csd.value.ArgsValueFactory;
import com.csd.value.CommonArgsValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArgsParser {
    private final Schemas schemas;
    private List<CommonArgsValue> args;

    public ArgsParser(Schemas schemas, String[] paramArgs) {
        this.schemas = schemas;
        args = parseArgsTxt(paramArgs);
    }

    private List<CommonArgsValue> parseArgsTxt(String[] args) {
        List<CommonArgsValue> list = new ArrayList<>();
        for (String arg : args) {
            list.add(processArgs(arg, list));
        }
        return list;
    }

    private CommonArgsValue processArgs(String arg, List<CommonArgsValue> arrayList) {
        if (arg.startsWith("-") && arg.length() == 2) {
            return ArgsValueFactory.getArgsValue(
                    arg.substring(1), schemas.getType(arg.substring(1)));
        }
        return getCommonArgsValue(arg, arrayList);
    }

    private CommonArgsValue getCommonArgsValue(String arg, List<CommonArgsValue> arrayList) {
        CommonArgsValue commonArgsValue = arrayList.get(arrayList.size() - 1);
        commonArgsValue.parseValue(arg);
        return commonArgsValue;
    }

    public Object getValue(String flag) {
        Optional<CommonArgsValue> opCommonArgsValue =
                args.stream().filter(item -> item.getFlag().equals(flag)).findFirst();
        return opCommonArgsValue.get().getValue();
    }
}
