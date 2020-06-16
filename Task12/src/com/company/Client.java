package com.company;

public class Client {


    public class Client extends User {


        private static int COUNTER = 0;
        private int clientID;
        private BankAccount account;
        public Client(BankAccount account, String name, String surname) {
            super(name, surname);
            this.clientID = COUNTER++;
            this.account = account;
        }

        public void payIn(double amount) throws AccountOperationsException {
            this.account.makePayment(amount);
        }
        public void makeTransfer(double amount, BankAccount to) throws AccountOperationsException {
            this.account.makeTransfer(amount, to);
        }
    }
}