package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String Busket;

        Category What = new Category();
        Category Drink = new Category("Water");
        Category Eat = new Category("Bread", new ArrayList<>());

        Drink.setProduct("water");
        Eat.setProduct("nothing");
        What.setProducts("banana");

        Busket  = new Busket();
        Busket second = new Busket("full");


    }
}