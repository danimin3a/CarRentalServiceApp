package com.sda.spring.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.sda.spring.entities")//where to look for entity
@EnableJpaRepositories("com.sda.spring.repositories")//where to look for repositories
public class DbConfiguration {
}
