package com.company;

public class Manager extends Employee {


    double bonus;

    public Manager(String firstname, String lastname, double birthdayYear,
                   String companyName, double hireDate, double salary, double bonus) {
        super(firstname, lastname, birthdayYear, companyName, hireDate, salary);
        this.bonus = bonus;
    }



    public double getSalary() {
        double Stonks = Salary+bonus ;
        return  Stonks;
    }
    public String toString() {
        return "Managers last name is" + this.Lastname +"  age " +getAge() +
                " and salary " + getSalary();
    }
}