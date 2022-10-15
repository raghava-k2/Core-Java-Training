package com.training.oops;

interface Interface1 {

    int a = 10;

    void get();

    int getName();

    default public void default1() {
        System.out.println("Inside default");
    }

    static public void staticMethod() {
        System.out.println("Inside Static Method");
    }
}

public class InterfaceExample implements Interface1 {
    @Override
    public int getName() {
        return 0;
    }

    @Override
    public void get() {
        System.out.println("Inside get");
    }

    public static void main(String[] args) {
        System.out.println(Interface1.a);
        InterfaceExample i = new InterfaceExample();
        i.default1();
        Interface1.staticMethod();
    }
}
