package com.training.staticKeyword;

public class StaticMethodExample {

    public int id = 10;

    public static StaticMethodExample s = new StaticMethodExample();

    public void printName() {
        System.out.println("Inside non-static method");
        print();
    }

    public static void print() {
        System.out.println("Inside Static method" + s.id);
    }

    public static void main(String[] args) {
        print();
        StaticMethodExample s = new StaticMethodExample();
        s.printName();
    }
}
