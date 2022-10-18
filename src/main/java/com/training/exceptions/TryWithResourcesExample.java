package com.training.exceptions;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader b = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                new File("D:\\workspace\\CoreJavaTraining\\src\\main\\java\\com\\training\\exceptions\\TryWithResourcesExample.java"))
                ))) {
            System.out.println(b.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
