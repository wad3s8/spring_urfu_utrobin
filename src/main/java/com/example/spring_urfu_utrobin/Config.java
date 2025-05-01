package com.example.spring_urfu_utrobin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
public class Config {

    @Profile("test")
    @Bean
    public String TestProfile() {
        log.info("Created TestProfile");
        return "";
    }

    @ConditionalOnBean(name = "TestProfile")
    @Bean
    public String IfTestProfile() {
        log.info("Created IfTestProfile");
        return "";
    }

    @ConditionalOnExpression("#{'${environment}' != 'default'}")
    @Bean
    public String environment() {
        log.info("Created environment");
        return "";
    }

}
