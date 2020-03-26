package com.company;

public class Airplane {

    public String brand;
    public int numberOfSeats;

    public Airplane(String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}

