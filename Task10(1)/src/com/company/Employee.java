package com.company;

public class Employee extends Person {
    double Salary;
    String CompanyName;
    double HireDate;

    public Employee(String firstname, String lastname, double birthdayYear,
                    String companyName, double hireDate, double salary) {
        super(firstname, lastname, birthdayYear);


        this.CompanyName = companyName;
        this.HireDate = hireDate;
        this.Salary = salary;
    }



    public double getSalary() {
        return Salary;
    }


    public double getJobSeniority(){
        double salarySenior = 7284;
        return salarySenior;
    }
}
