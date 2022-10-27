package com.training.staticKeyword;

public class StaticClassExample {

    static class MyStaticClass {//nested class
        public static int id = 10;
    }

    public static void main(String[] args) {
        System.out.println(MyStaticClass.id);
    }
}
