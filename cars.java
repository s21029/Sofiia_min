package com.company;

public class cars {
    int Enginecapacity;
    String Color;
    String Brand;

    public cars (int Enginecapacity, String Color, String Brand) {
        this.Enginecapacity = Enginecapacity;
        this.Color = Color;
        this.Brand = Brand;

    }
    public String Color () {
        return this.Color;
    }
    public int Liters() {
        return this.Enginecapacity;
    }
    public String Brand () {
        return this.Brand;
    }
    public void Speed() {
        if ( Enginecapacity >= 21) {
            System.out.println(" High speed");
        } else {
            System.out.println(" Low speed");
        };
    }
}

