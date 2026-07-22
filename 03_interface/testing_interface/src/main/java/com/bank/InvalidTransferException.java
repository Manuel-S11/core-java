package com.bank;

public class InvalidTransferException extends RuntimeException{
    public InvalidTransferException(String message) {
        super(message);
    }
}
