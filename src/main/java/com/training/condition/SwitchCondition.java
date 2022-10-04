package com.training.condition;

public class SwitchCondition {

    public static void switchCondition(int value) {
        switch (value) {
            case 10:
                System.out.println("switch value1 :" + value);
                break;
            case 20:
                System.out.println("switch value2 :" + value);
                break;
            case 30:
                System.out.println("switch value3 :" + value);
                break;
            default:
                System.out.println("switch value4 :" + value);
        }
    }

    public static void main(String[] args) {
        switchCondition(10);
        switchCondition(20);
        switchCondition(30);
        switchCondition(40);
    }
}
