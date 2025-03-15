package com.example.spring_urfu_utrobin;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person_field {
    @Autowired
    @Qualifier("bike")
    Vehicle vehicle;
    String name;

    public void call(){
        System.out.println("DI field");
        vehicle.printVehince();
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct field");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy field");
    }
}
