package com.training.exceptions;

class InvalidParameterException extends RuntimeException {
    InvalidParameterException() {
        super();
    }

    InvalidParameterException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void get(String input) {
        if (input.equals("test")) {
            System.out.println("Input :" + input);
        } else {
            throw new InvalidParameterException("Invalid parameter" + input);
        }
    }

    public static void main(String[] args) {
           get("test");
           get("test1");
    }
}
