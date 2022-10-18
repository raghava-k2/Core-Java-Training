package com.training.exceptions;

import java.io.FileNotFoundException;


class ParentExample {
    public int getFileId(String name) throws FileNotFoundException {
        if (name.equals("test")) {
            return 10;
        } else {
            throw new FileNotFoundException("File is not present");
        }
    }
}

public class OverriddenMethodsWithExceptionsExample extends ParentExample {

    @Override
    public int getFileId(String name) throws FileNotFoundException, ClassCastException, ArithmeticException {
        return 10;
    }
}
