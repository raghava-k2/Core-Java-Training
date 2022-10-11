package com.training.strings;

public class StringExample {
    public static void main(String[] args) {
        String a = "hello world";
        String b = "hello world";
        String c = new String("hello world");
        System.out.println(a.hashCode() + "::" + b.hashCode() + "::" + c.hashCode());
        a = a.replaceAll("hello", "HELLO");
        System.out.println(a);
    }
}
