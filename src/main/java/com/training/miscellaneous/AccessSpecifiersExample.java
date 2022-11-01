package com.training.miscellaneous;

class Parent1 {
    private int id = 10;
    protected int salary = 200;
    public String name = "test";
    String address = "hyderabad";

    public void get() {
        System.out.println("Inside get");
    }

    protected void get1() {
        System.out.println("Inside get1");
    }

    private void get2() {
        System.out.println("Inside get2");
    }

    void get3() {
        System.out.println("Inside get3");
    }
}

public class AccessSpecifiersExample {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        ProtectedExample p1 = new ProtectedExample();
        p1.salary = 2000;
        p1.count=11;
        p.salary = 2000;
        p.name = "tes1";
        p.address = "hyd";
        p.get1();
        p.get();
        p.get3();
    }
}
