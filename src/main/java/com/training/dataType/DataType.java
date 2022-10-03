package com.training.dataType;

public class DataType {

    public int salary = 10000;

    public float hikePercentage = 10.5F;

    public static boolean isValid = true;

    public static void calculate() {
        System.out.println("Calculate");
    }

    public void cal() {
        System.out.println("Calculate1");
    }

    public static void main(String[] args) {
        int a = 10;//2^32
        long b = 20;//2^64
        byte c = 1;//2^8
        short d = 200;//2^16
        float e = 10.99F;//2^32
        double f = 121.1212d;//2^64
        boolean g = true;// 1 bit
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        System.out.println("d :" + d);
        System.out.println("e :" + e);
        System.out.println("f :" + f);
        System.out.println("g :" + g);
        DataType.calculate();
        DataType dd = new DataType();
        dd.cal();
        System.out.println("salary" + dd.salary + "hike" + dd.hikePercentage);
        System.out.println(DataType.isValid);
    }
}
