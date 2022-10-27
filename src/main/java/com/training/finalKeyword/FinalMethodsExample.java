package com.training.finalKeyword;

class Example {
    public final void get() {
        System.out.println("Inside final method");
    }

    public void getName() {
        System.out.println("Inside getName method");
    }
}

public class FinalMethodsExample extends Example {

    @Override
    public void getName() {
        System.out.println("Override getName method");
        super.getName();
    }

    public static void main(String[] args) {
        new FinalMethodsExample().get();
        new FinalMethodsExample().getName();
    }
}
