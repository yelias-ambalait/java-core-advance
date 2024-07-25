package exceptions;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0 ) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(balance+" Insufficient funds for this withdrawal.");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
