package com.training.finalKeyword;

final class FinalClass {
    public void get() {
        System.out.println("Inside Get method");
    }
}

public class FinalClassExample {

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.get();
    }
}
