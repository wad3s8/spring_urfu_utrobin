package com.example.spring_urfu_utrobin.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TodoListDto {
    private String name;
    private List<String> events;
}
