package com.example.spring_urfu_utrobin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring_urfu_utrobin");

        Person_constructor constr = context.getBean("person_constructor", Person_constructor.class);
        Person_field field = context.getBean("person_field", Person_field.class);
        Person_setter setter = context.getBean("person_setter", Person_setter.class);
        constr.call();
        field.call();
        setter.call();

        context.close();
    }
}
