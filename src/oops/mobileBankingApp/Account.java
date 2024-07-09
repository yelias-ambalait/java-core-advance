package oops.mobileBankingApp;
public class Account {
    private double balance;
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return this.balance;
    }
    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}
