package org.example.bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class RandomBean {

    @Bean(name = "abc")
    public String str1(){
       return "Welcome to Cydeo";
    }

    @Bean
    public String str2(){
        return "Spring Core Practice";
    }




}
