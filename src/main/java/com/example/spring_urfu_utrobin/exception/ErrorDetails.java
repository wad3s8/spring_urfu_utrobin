package com.example.spring_urfu_utrobin.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorDetails {
    private int status;
    private String message;
}