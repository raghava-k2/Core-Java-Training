package com.training.condition;

import com.training.miscellaneous.ProtectedExample;

class ProtectedExample1 extends ProtectedExample{
    public void get(){
        System.out.println(this.salary);
        super.get1();
    }
}

public class IfCondition {

    public static void printName(int value) {
        if (value > 100) {
            System.out.println("Value is greater than 100 :" + value);
        } else if (value < 100) {
            System.out.println("Value is less than 100 : " + value);
        } else if (value == 200 || value > 400) {
            System.out.println("Value is less than 100 : " + value);
        } else {
            System.out.println("Value is equal to 100 : " + value);
        }
    }

    public static void main(String[] args) {
        printName(100);
        printName(1000);
        printName(10);
        ProtectedExample p = new ProtectedExample();
        p.id = 100;
        p.get();
    }
}
