package com.training.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("hello world");
        System.out.println(s.hashCode());
        s.append("!");
        System.out.println("String builder : " + s + "::" + s.hashCode());
        String ss = s.toString();
        System.out.println("String value :" + ss);
    }
}
