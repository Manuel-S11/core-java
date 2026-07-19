package com.java8.ExceptionHandler;

public class InvalidPaymentException extends RuntimeException{

    public InvalidPaymentException(String message) {
        super("Please check your request".formatted(message));

    }
}
