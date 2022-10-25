package com.training.arrays;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] obj = new Object[3];
        obj[0] = "string";
        obj[1] = 10;
        obj[2] = 10.12121;

        if (obj[0] instanceof String) {
            System.out.println(obj[0]);
        }

        if(obj[1] instanceof Integer){
            System.out.println(obj[1]);
        }
    }
}
