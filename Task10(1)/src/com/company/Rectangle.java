package com.company;

public class Rectangle implements Figure {

    double Surface;
    double Perimetr;
    double A;
    double B;

    public double getPerimeter() {
        Perimetr = (A+B)*2;
        return Perimetr;
    }
    public double getArea() {
        Surface = A * B ;
        return Surface;
    }

    public Rectangle(double A, double B) {
        A = A;
        B = B;
    }
    public String getType() {
        String name = " rectangle ";
        return name ;
    }
}
