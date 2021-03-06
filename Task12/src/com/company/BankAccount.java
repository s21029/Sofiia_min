import java.util.ArrayList;

public class BankAccount implements AccountOperations {
    public BankAccount(double accountBalance, ArrayList<Transaction> listOfTransactions) {
        this.bankAccountID = COUNTER++;
        this.accountBalance = accountBalance;
        this.listOfTransactions = listOfTransactions;
    }
    private static int COUNTER = 0;

    private int bankAccountID;

    private double accountBalance = 0;

    private ArrayList<Transaction> listOfTransactions;


    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public ArrayList<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }
    public void setListOfTransactions(ArrayList<Transaction> listOfTransactions) {
        this.listOfTransactions = listOfTransactions;
    }




    @Override
    public void makePayment(double amount) throws AccountOperationsException {
        if(accountBalance>=amount) {
            accountBalance += amount;
            Transaction t = new Transaction(amount, this, this);
            listOfTransactions.add(t);
        }else {
            AccountOperationsException noMoney = new AccountOperationsException("Account balance 0");
        }
    }

    public void makeTransfer(double amount, BankAccount to) throws AccountOperationsException {
        if(accountBalance>=amount) {
            accountBalance -= amount;
            to.accountBalance += amount;
            Transaction t = new Transaction(amount, this, to);
            listOfTransactions.add(t);
        }else {
            AccountOperationsException noMoney = new AccountOperationsException("Account balance 0");
        }
    }


    public double checkAccountBalance() {
        return accountBalance;
    }
}