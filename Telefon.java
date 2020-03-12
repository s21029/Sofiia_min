package com.company;

public class Telefon {


    int Number;
    int ScreenResolution;
    String Brand;
    String Massege;

    public Telefon (int Number, int ScreenResolution, String Brand, String Massege) {
        this.Number = Number;
        this.ScreenResolution = ScreenResolution;
        this.Brand = Brand;
        this.Massege = Massege;
    }
    public int SendMobileNumber () {
        return this.Number;
    }
    public String SebdMobileMessenge () {
        return this.Massege;
    }
}

