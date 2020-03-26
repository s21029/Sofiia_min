package com.company;

public class Main {

    public static void main(String[] args) {

        Airplane boeing = new Airplane("737", 90);

        Engine air = new Engine(2020, 3000);
        air.getEngine();

        double Power = air.getPower();

        boolean Eco = air.checkEco();

        String Brand = boeing.getBrand();

        int Number = boeing.getNumberOfSeats();

        int Year = air.getProductionYear();

        System.out.println("Brand: " + Brand + " number of seats: " + Number + " engine was made in: "
                + Year + " engine power rate is: " + Power + " Is engine eco?  " + Eco);
    }

}

