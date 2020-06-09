package com.example.springaoplearn.service;

import org.springframework.stereotype.Component;

@Component
public class LogManager {

    public void log() {
        System.out.println("log");
    }
}
