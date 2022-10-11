package com.training.loops;

public class ForEach {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array Value:" + array[i]);
        }
        for (int b : array) {//forEach
            System.out.println("Array Value inside forEach:" + b);
        }
    }
}
