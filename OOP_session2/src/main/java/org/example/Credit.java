package org.example;

public class Credit extends Transaction{
    @Override
    public void transfer() {
        System.out.println("Credit transfer");
    }
}
