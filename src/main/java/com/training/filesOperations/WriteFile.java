package com.training.filesOperations;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("Test.txt"))));
        b.write("test hello world");
        b.write("next line");
        b.newLine();
        b.write("next line1");
        b.close();
        System.out.println("End of write File");
    }
}
