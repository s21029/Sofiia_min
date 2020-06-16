package com.company;

public class AccountOperations {

    void makePayment(double amount) throws AccountOperationsException;

    void makeTransfer(double amount, BankAccount to) throws AccountOperationsException;

    double checkAccountBalance();

}
