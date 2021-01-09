package com.sda.spring.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication//tells us this is Spring application
@ComponentScan("com.sda.spring")//search for components
@Import({DbConfiguration.class})//insert configuration classes to read
public class AppConfiguration {
}
