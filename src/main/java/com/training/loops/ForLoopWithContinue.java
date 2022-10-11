package com.training.loops;

public class ForLoopWithContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                continue;
            }
            System.out.println("I Value : " + i);
        }
    }
}
