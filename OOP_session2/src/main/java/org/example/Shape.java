package org.example;

public class Shape {

    public double area (double length , double width){
        return length * width;
    }

    public double area (double radius){
        return Math.PI * radius * radius;
    }
}
