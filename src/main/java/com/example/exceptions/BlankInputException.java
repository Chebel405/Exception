package com.example.exceptions;

public class BlankInputException extends Exception {
    public BlankInputException() {
        super();
    }

    public BlankInputException(String message) {
        super(message);
    }
}
