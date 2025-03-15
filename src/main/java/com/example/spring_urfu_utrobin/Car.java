package com.example.spring_urfu_utrobin;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Override
    public void printVehince() {
        System.out.println("This is the car");
    }

    @PostConstruct
    public void init() {
        System.out.println("Car initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car destroy");
    }
}
