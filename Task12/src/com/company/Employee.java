package com.company;

public class Employee {

    import java.util.ArrayList;
    import java.util.UUID;

    public class Employee extends User {
        private static int COUNTER = 0;
        int employeeID;
        ArrayList<Client> clients = new ArrayList<>();

        public Employee(String name, String surname) {
            super(name, surname);
            this.employeeID = COUNTER++;

        }



        public Client addClient(String name, String surname, double accountBalance) {
            BankAccount a = new BankAccount(accountBalance, null);
            Client a1 = new Client(a1, name, surname);
            return a1;
        }

        public void acceptPayment(double payment, BankAccount account) throws AccountOperationsException {
            account.makePayment(payment);
        }

        public void acceptPayment(double payment, BankAccount from, BankAccount to) throws AccountOperationsException {
            from.makeTransfer(payment, to);
        }
    }
}

