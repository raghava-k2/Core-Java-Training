package com.training.miscellaneous;

public class ProtectedExample {
    public int id = 10;
    protected int salary = 100;
    int count = 0;

    public void get() {
        System.out.println("Inside get");
    }

    protected void get1() {
        System.out.println("Inside get1");
    }

    void get2() {
        System.out.println("Inside get2");
    }
}
