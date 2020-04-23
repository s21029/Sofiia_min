package com.company;

public class Adress {

    String Country;
    String City;
    int Code;
    String Street;
    int Apartment;

    public Adress(String country, String city, int code, String street, int apartment) {
        this.Country = country;
        this.City = city;
        this.Code = code;
        this.Street = street;
        this.Apartment = apartment;
    }


    public String getAdress() {
        return String.format ("Country: " + Country);
    }

    public String getAdress(String country, String city) {

        return String.format("Country: " + Country + ", City: " + City);
    }

    public String getAdress(String country, String city, int code) {

        return String.format("Country: " + Country + ", City: " + City + ", Code: " + Code);
    }

    public String getAdress(String country, String city, int code, String street) {

        return String.format("Country: " + Country + ", City: " + City + ", Code: " + Code + ", Street:  " + Street);
    }

    public String getAdress(String country, String city, int code, String street, int apartment) {

        return String.format("Country: " + Country + ", City: " + City + ", Code: " + Code + ", Street:  " + Street + ", Apartment: " + Apartment);
    }
}
