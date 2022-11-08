package com.qap3.Q1;

public class AgeException extends Exception{

    public AgeException() {
        super("Incorrect age entered");
    }

    public AgeException(String message) {
        super(message);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
