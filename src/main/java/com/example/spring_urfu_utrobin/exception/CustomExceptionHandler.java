package com.example.spring_urfu_utrobin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<?> handleBadGatewayException(BadGatewayException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(HttpStatus.BAD_GATEWAY.value(), ex.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_GATEWAY);
    }
}
