package com.sda.spring;

import com.sda.spring.config.AppConfiguration;
import org.springframework.boot.SpringApplication;

public class App {
    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class,args);
    }
}
