package org.example;

public class Cat extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Meow");
    }
}
