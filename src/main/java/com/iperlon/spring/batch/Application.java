package com.iperlon.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        args = new String[1];
        args[0] = "monparam1=test";
        SpringApplication.run(Application.class, args);
    }
}