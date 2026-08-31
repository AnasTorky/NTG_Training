package com.example.Session1_Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Class2 {
    private String name;
    private int age;

    public Class2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

}
