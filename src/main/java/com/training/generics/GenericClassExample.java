package com.training.generics;

class GenericClassExample1<T, U, V> {

    public T a;

    public T getName() {
        return this.a;
    }

    public void setName(T input) {
        this.a = input;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        GenericClassExample1<String, Integer, Float> g1 = new GenericClassExample1<>();
        g1.setName("test");
        System.out.println(g1.getName());

        GenericClassExample1 g2 = new GenericClassExample1<>();
        g2.setName("test");
        System.out.println(g2.getName());
    }
}
