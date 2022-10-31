package com.training.exceptions;

class InvalidParameterException extends Exception {
    InvalidParameterException() {
        super();
    }

    InvalidParameterException(String message) {
        super(message);
    }
}

class AException extends Exception{}

class BException extends InvalidParameterException{}

class CExample{
    public void get() throws InvalidParameterException{

    }
}

class DExample extends CExample{
    @Override
    public void get() throws BException{

    }
}

public class CustomExceptionExample {

    public static void get(String input) throws InvalidParameterException {
        if (input.equals("test")) {
            System.out.println("Input :" + input);
        } else {
            throw new InvalidParameterException("Invalid parameter" + input);
        }
    }

    public static void main(String[] args) throws InvalidParameterException {
           get("test");
           get("test1");
    }
}
