package com.example.spring_urfu_utrobin;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    @Override
    public void printVehince() {
        System.out.println("This is a bike.");
    }
    @PostConstruct
    public void init() {
        System.out.println("Bike initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bike destroyed.");
    }
}
