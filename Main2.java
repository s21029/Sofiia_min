package com.company;

public class Main {

    public static void main(String[] args) {
        cars Kopejka = new cars(80, "Yellow", "Kopejka");
        String Color = Kopejka.Color();
        int Enginecapacity = Kopejka.Liters();
        String Brand = Kopejka.Brand();
        System.out.print("Color " + Color + " brand " + Brand + " enginecapacity " + Enginecapacity + " ");
        Kopejka.Speed();
    }
}
