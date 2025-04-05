package com.example.spring_urfu_utrobin.violation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Violation {

    private final String fieldName;
    private final String message;
}
