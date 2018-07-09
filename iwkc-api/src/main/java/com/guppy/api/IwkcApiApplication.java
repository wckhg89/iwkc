package com.guppy.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.guppy.domain"})
@EntityScan(basePackages = {"com.guppy.domain"})
public class IwkcApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IwkcApiApplication.class, args);
    }
}
