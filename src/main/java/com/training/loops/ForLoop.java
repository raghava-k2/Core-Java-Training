package com.training.loops;

public class ForLoop {
    public static void main(String[] args) {
        int a = 10, b = 12;
        for (int c = 4; a < 14 && (b < 14 || c < 12); c++) {
            a++;
            b++;
        }
        System.out.println(a + ":::" + b + "::");
    }
}
