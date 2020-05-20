package com.company;

public abstract class Animal {


    String Name;

    public Animal(String name) {
        this.Name = name;
    }


    abstract String getType();
    public String getName() {
        return Name;
    }
}
