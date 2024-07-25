package exceptions.superClassConstructor;

public class Account {
    protected double balance;
    public Account(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException("initialBalance must be positive.");
        }
        this.balance = initialBalance;
        System.out.println("Account created with initialBalance. Current balance: "+balance);
    }
    public double getBalance() {
        return balance;
    }

}
