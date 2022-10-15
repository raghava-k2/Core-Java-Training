package com.training.oops;

abstract class AbstractExample {
    public void department() {
        System.out.println("Inside department");
    }

    abstract public void typeOfObject();
}

public class AbstractionExample extends AbstractExample {

    @Override
    public void typeOfObject() {
        System.out.println("type of Object : AbstractionExample");
    }

    public static void main(String[] args) {
        AbstractionExample a = new AbstractionExample();
        a.typeOfObject();
        a.department();
    }
}
