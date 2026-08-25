package org.example;

public class Room implements Shapee{
    int l;
    int w;
    @Override
    public double area() {
        return l*w;
    }

}
