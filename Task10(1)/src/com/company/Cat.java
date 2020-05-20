package com.company;

public class Cat extends Animal implements Moveable  {
    public Cat(String name) {
        super(name);
    }

    public void start() {
        System.out.println("start");
    }
    public void stop() {
        System.out.println("stop");
    }

    String getType() {
        String Type = "miaww";
        return Type;
    }
}