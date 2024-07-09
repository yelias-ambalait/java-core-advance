package oops.inheritance.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " New Balance " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw " + amount + " New Balance " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public void displayedAccountDetails() {
        System.out.println("Account details " + "\nAccount Number: " + getAccountNumber() + "\nTotal Balance: " + getBalance());
    }

    ;

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("03512100020533", 50000);
        ba.displayedAccountDetails();
        ba.deposit(22000);
        ba.withdraw(7500);
    }
}
