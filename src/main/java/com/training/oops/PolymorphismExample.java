package com.training.oops;

public class PolymorphismExample {

    //method overloading
    public void get() {
        System.out.println("inside get method");
    }

    public void get(int a) {
        System.out.println("a value : " + a);
    }

    public int get(float a) {
        return 0;
    }

    public static void main(String[] args) {
        PolymorphismExample p = new PolymorphismExample();
        p.get(10);
    }
}
