package com.example.spring_urfu_utrobin.controller;

import com.example.spring_urfu_utrobin.dto.PersonCreateDTO;
import com.example.spring_urfu_utrobin.dto.PersonResponseDTO;
import com.example.spring_urfu_utrobin.entity.Person;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @PostMapping("/api/person")
    public PersonResponseDTO cratePerson(@Valid @RequestBody PersonCreateDTO personDto){
        Person person = Person.builder().age(personDto.getAge()).email(personDto.getEmail()).name(personDto.getName()).id(52).build();
        return PersonResponseDTO.builder().id(person.getId()).age(person.getAge()).name(person.getName()).email(person.getEmail()).build();
    }
}
