package com.example.Session1_Spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    String hello(){
        return "Hello";
    }
}
