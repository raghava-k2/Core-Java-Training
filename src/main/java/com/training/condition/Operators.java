package com.training.condition;

public class Operators {

    public static void logical(int value) {
        if (value > 0 && value < 10) {
            System.out.println("value is between 0 and 10 :" + value);
        } else if (value == 100 || value < 100) {
            System.out.println("value is less than 100 :" + value);
        }
        if (!(value == 100)) {
            System.out.println("value is not equal to 100 :" + value);
        }
    }

    public static void ternary(int value) {
        System.out.println("value is not equal to 10 :" + (value == 10 ? value : value == 8 ? value : value * 10));
    }

    public static void incrementOrDecrement(int value) {
        int count = value++;
        System.out.println("count value :" + count);
        if (value == 10) {
            System.out.println("value is incremented :" + (value++));
        }
        System.out.println("value is decremented  :" + (--value));
    }

    public static void bitWise(int value){
        System.out.println("BitWise & :" + (value & 1));//1010 & 0001=0000=0
        System.out.println("BitWise | :" + (value | 1));//1010 | 0001=1011=11
        System.out.println("BitWise ^ :" + (value ^ 1));//1010 ^ 0001=1011=11
    }

    public static void main(String[] args) {
        //local operators && ,||,!
        //Bitwise operators &,|,~,^
        //Assignment operators =
        //Equals operator ==,!=
        //Ternary operators ?
        //relational >,<,>=,<=
        //increment or decrement ++,--
        logical(1);
        logical(10);
        ternary(10);
        ternary(9);
        incrementOrDecrement(10);
        bitWise(10);
    }
}
