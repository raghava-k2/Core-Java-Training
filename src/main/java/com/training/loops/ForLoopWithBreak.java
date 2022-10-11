package com.training.loops;

public class ForLoopWithBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I value: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
