package com.university;

public class Furniture {
    private static final double vat = 0.23;

    private String name;
    private double price;

    public Furniture() {
    }

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVatPrice() {
        return price + price * vat;
    }
}
