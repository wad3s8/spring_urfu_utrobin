package com.example.spring_urfu_utrobin.dto;

import com.example.spring_urfu_utrobin.customValidation.CapitalLetter;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Valid
public class PersonCreateDTO {
    @Email
    private String email;

    @Min(1)
    @Max(150)
    private int age;

    @NotBlank
    @CapitalLetter
    private String name;
}
