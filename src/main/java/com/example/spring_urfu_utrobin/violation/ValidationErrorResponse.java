package com.example.spring_urfu_utrobin.violation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ValidationErrorResponse {
    private int statusCode;
    private List<Violation> violations = new ArrayList<>();
}

