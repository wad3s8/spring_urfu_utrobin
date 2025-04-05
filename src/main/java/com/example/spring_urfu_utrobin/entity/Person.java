package com.example.spring_urfu_utrobin.entity;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Person {

    private int id;
    private String email;
    private int age;
    private String name;
}
