package com.example.spring_urfu_utrobin;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person_constructor {
    private String name;
    public Vehicle vehicle;

    @Autowired
    public Person_constructor(@Qualifier("bike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void call(){
        System.out.println("DI constructor constructor");
        vehicle.printVehince();
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct constructor");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }
}
