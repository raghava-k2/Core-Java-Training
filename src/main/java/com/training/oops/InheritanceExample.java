package com.training.oops;

public class InheritanceExample extends EncapsulationExample {

    public String name = "test";
    public int id = 100;

    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return 100;
    }

    public static void main(String[] args) {
        InheritanceExample i = new InheritanceExample();
        System.out.println("I.getId : " + i.getId());
        System.out.println("I.getName : " + i.getName());
        EncapsulationExample e = new InheritanceExample();
        System.out.println("e.getId : " + e.getId());
        System.out.println("e.Id : " + e.id);
        System.out.println("i.Id : " + i.id);
    }
}
