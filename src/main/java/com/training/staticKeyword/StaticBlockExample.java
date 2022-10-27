package com.training.staticKeyword;

public class StaticBlockExample {

    public int id = 10;

    public static int salary = 100;

    static {
        System.out.println(salary);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("com.training.staticKeyword.StaticBlockExample");
        //noinspection deprecation
        System.out.println(c.newInstance());
    }
}
