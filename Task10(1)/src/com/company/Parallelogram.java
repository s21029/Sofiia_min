package com.company;

public class Parallelogram implements Figure {
    double Perimetr;


    double Surface;
    public double getArea() {
        Surface = baseSide * height;
        return Surface;
    }
    public double getPerimeter() {
        Perimetr = (baseSide+side)*2 ;
        return Perimetr;
    }
    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
    public String getType() {
        String name = " paralelogram ";
        return name ;
    }
}
