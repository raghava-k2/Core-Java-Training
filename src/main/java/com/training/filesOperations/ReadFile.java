package com.training.filesOperations;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\workspace\\CoreJavaTraining\\src\\main\\java\\com\\training\\filesOperations\\ReadFile.java"))));
        b.lines().forEach(i -> {
            System.out.println(i);
        });
    }
}
