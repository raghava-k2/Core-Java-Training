package com.training.exceptions;

import java.io.*;

public class CheckedExceptionExample {

    public static void get() throws InterruptedException {
        Thread.sleep(200);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main method");
        try {
            Thread.sleep(200);
            System.out.println("Inside Try block");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Inside second catch block");
        } finally {
            System.out.println("Inside Finally block");
        }
        try {
            BufferedReader b = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File("D:\\workspace\\CoreJavaTraining\\src\\main\\java\\com\\training\\filesOperations\\ReadFile1.java"))));
            b.lines().forEach(System.out::println);
            b.close();
            Thread.sleep(2000);
        } catch (InterruptedException | IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        get();
    }
}
