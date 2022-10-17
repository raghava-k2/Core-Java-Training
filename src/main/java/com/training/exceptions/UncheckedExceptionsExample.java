package com.training.exceptions;

import java.util.Hashtable;

public class UncheckedExceptionsExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 1;
            System.out.println("Divisible Value :" + a);
            Hashtable<String, String> m = new Hashtable<>();
            m.put(null, null);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("exception" + e);
            e.printStackTrace();
        }
    }
}
