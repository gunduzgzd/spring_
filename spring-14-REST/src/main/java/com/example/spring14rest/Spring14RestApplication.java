package com.example.spring14rest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring14RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring14RestApplication.class, args);
    }


    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}
