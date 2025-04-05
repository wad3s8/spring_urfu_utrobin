package com.example.spring_urfu_utrobin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {
    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("messages"); // Указывает базовое имя файлов сообщений
        source.setDefaultEncoding("UTF-8"); // Устанавливает кодировку файлов сообщений
        return source;
    }
}
