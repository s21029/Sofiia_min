package com.university;

import java.util.List;

public class Room {
    private double area;
    private final List<Furniture> furnitureList;

    public Room(double area, List<Furniture> furnitureList) {
        this.area = area;
        this.furnitureList = furnitureList;
    }

    public double getArea() {
        return area;
    }

    public double getFurnitureListPrice() {
        double totalPrice = 0;
        for (Furniture furniture: furnitureList) {
            totalPrice += furniture.getVatPrice();
        }
        return totalPrice;
    }
}
