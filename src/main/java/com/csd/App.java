package com.csd;

public class App {
    public static void main(String[] args) {
        args = getArgs(args);
        ArgsParser argsParser = new ArgsParser(getSchemas(), args);
        outParams(argsParser);
    }

    private static void outParams(ArgsParser argsParser) {
        System.out.println(argsParser.getValue("l"));
        System.out.println(argsParser.getValue("p"));
        System.out.println(argsParser.getValue("d"));
    }

    private static Schemas getSchemas() {
        String schemaStr = "l:boolean p:integer d:string";
        return new Schemas(schemaStr);
    }

    private static String[] getArgs(String[] args) {
        if (args.length == 0) {
            args = new String[] {"-l", "-p", "8080", "-d", "/usr/logs"};
        }
        return args;
    }
}
