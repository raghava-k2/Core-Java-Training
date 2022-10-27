package com.training.staticKeyword;

public class StaticPropertyExample {

    public int id = 100;

    public static int salary = 1000;

    public static void main(String[] args) {
        System.out.println(StaticPropertyExample.salary);
        System.out.println(new StaticPropertyExample().id);
    }
}
