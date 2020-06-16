package com.company;
import java.util.ArrayList;
public class Admin extends Employee {


    private static int COUNTER = 0;
    private ArrayList<Employee> employees;

    public Admin(String name, String surname) {
        surname(name, surname);
        this.employees = COUNTER++;
    }
    public Employee createEmployee(String name, String surname) {
        Employee a = new Employee(name, surname);
        employees.add(a1);
        return a1;
    }
    public void removeEmployee(Employee a1) {
        employees.remove(a1);
    }

}