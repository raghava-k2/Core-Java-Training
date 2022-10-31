package com.training.streams;

@FunctionalInterface
interface Functional1<T> {

    T get();

    default void getName(){
        System.out.println("Inside functional default method");
    }

    static void get1(){
        System.out.println("Inside functional static method");
    }
}

public class FunctionInterfaceExample {

    public static String getName(Functional1<String> functional1) {
        return functional1.get();
    }

    public static void main(String[] args) {
        System.out.println(getName(() -> {
            System.out.println("Inside get functional interface");
            return "test";
        }));
    }
}
