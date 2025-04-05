package com.example.spring_urfu_utrobin.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonResponseDTO {
    private int id;
    private String email;
    private int age;
    private String name;
}
