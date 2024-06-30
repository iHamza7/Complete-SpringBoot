package com.example.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean

    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First Bean");
    }

    @Bean

    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Second Bean 1qq qq gg");
    }
}
