package com.example.spring_urfu_utrobin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.spring_urfu_utrobin.entity")
@EnableJpaRepositories(basePackages = "com.example.spring_urfu_utrobin.repository")

public class SpringUrfuUtrobinApplication {
    @Bean
    public CommandLineRunner inspectEntities(EntityManager entityManager) {
        return args -> {
            System.out.println(">>> Managed JPA entities:");
            for (EntityType<?> entity : entityManager.getMetamodel().getEntities()) {
                System.out.println(" - " + entity.getJavaType().getName());
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringUrfuUtrobinApplication.class, args);
    }

}
