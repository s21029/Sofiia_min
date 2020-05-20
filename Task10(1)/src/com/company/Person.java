package com.company;

public abstract class Person {
    String Lastname;
    double BirthdayYear;
    String Firstname;




    public Person(String Firstname, String Lastname, double BirthdayYear) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.BirthdayYear = BirthdayYear;
    }
    public double getAge(){
        double age = 2000 - BirthdayYear;
        return age;
    }
}