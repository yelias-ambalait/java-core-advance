package controlFlow.switchs;

import java.util.InputMismatchException;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Total balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else if (amount < 0) {
            System.out.println("Invalid amount");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
