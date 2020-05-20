package com.company;

public class Circle implements Figure {


    double Radius;
    double Perimetr;
    double Surface;



    public double getPerimeter() {

        Perimetr = 3.14 * Radius * 2 ;
        return Perimetr;
    }

    public Circle(double radius) {
        this.Radius = radius;
    }

    public String getType() {
        String name = " Circle ";
        return name ;
    }

    public double getArea() {
        Surface = Radius * Radius * 3.14;
        return Surface;
    }

}