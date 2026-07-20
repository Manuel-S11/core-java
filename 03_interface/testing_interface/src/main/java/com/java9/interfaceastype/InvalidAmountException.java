package com.java9.interfaceastype;

public final class InvalidAmountException extends RuntimeException{

    public InvalidAmountException(String message) {
        super("Invalid Amount: %s".format(message));
    }
}
