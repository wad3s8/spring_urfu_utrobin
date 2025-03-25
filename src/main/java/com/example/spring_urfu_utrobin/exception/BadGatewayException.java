package com.example.spring_urfu_utrobin.exception;

public class BadGatewayException extends RuntimeException {
    public BadGatewayException(String message) {
        super(message);
    }
}
