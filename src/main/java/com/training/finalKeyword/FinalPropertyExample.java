package com.training.finalKeyword;

public class FinalPropertyExample {

    public final int id;

    public final static int salary;

    FinalPropertyExample() {
        this.id = 100;
    }

    static {
        salary = 1000;
    }

    public static void main(String[] args) {
        System.out.println(new FinalPropertyExample().id);
        System.out.println(salary);
    }
}
