package com.example.springaoplearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopLearnApplication.class, args);
    }

}
