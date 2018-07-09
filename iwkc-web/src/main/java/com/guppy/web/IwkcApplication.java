package com.guppy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.guppy.domain"})
@EntityScan(basePackages = {"com.guppy.domain"})
public class IwkcApplication {

    public static void main(String[] args) {
        SpringApplication.run(IwkcApplication.class, args);
    }
}
