package com.globallogic.evaluacion.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.globallogic.evaluacion"})
@EnableJpaRepositories(basePackages = {"com.globallogic.evaluacion.repository"})
@EntityScan("com.globallogic.evaluacion.model")
public class EvalApp {

    public static void main(String[] args) {
        SpringApplication.run(EvalApp.class, args);
    }

}