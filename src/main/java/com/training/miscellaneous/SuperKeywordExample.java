package com.training.miscellaneous;

class Parent {

    private String name;

    public int id = 10;

    Parent(String name) {
        this.name = name;
    }

    public String get() {
        return name;
    }
}

public class SuperKeywordExample extends Parent {

    SuperKeywordExample(String name) {
        super(name);
    }

    @Override
    public String get() {
        return super.get() + "_child";
    }

    public static void main(String[] args) {
        Parent p = new SuperKeywordExample("parent");
        System.out.println(p.get());
    }
}
