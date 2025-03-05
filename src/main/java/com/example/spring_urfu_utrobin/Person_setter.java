package com.example.spring_urfu_utrobin;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person_setter {
    Vehicle vehicle;
    String name;

    @Autowired
    @Qualifier("bike")
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void call(){
        System.out.println("DI setter");
        vehicle.printVehince();
    }

    @PostConstruct
    public void init(){
        System.out.println("PostConstruct setter");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy setter");
    }
}
