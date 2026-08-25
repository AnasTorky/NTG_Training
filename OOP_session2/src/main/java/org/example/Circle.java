package org.example;

public class Circle implements Shapee,BBBB{
    int r;
    @Override
    public double area() {
        return 3.14 *r*r;
    }

    @Override
    public void transfer() {
        System.out.println("Circle transfer");
    }
}
