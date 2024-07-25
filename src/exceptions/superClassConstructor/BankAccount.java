package exceptions.superClassConstructor;

import exceptions.InsufficientFundsException;

public class BankAccount extends Account{
    public BankAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundException(amount+" Insufficient funds for this withdrawal.");
        }
        balance -= amount;

    }
}
