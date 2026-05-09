package com.advanced.password;

public class UnSafePasswordException extends RuntimeException {
    public UnSafePasswordException(String message) {
        super(message);
    }

    public UnSafePasswordException() {
        super();
    }
}
