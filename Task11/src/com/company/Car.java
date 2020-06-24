package com.company;

import java.util.ArrayList;

public class Car implements Comparable<Car> {

    private int Year;
    private String Model;


    public Car(int year, String model) {
        this.Year = year;
        this.Model = model;
    }
    public void setYear(int year) {
        this.Year = year;
    }
    public int compareTo(Car other) {
        int compareResult = (this.getYear() - other.getYear());
        return compareResult;
    }
    public String toString() {
        return this.getModel() + " " + this.getYear();
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String name) {
        this.Model = name;
    }
    public int getYear() {
        return Year;
    }

}