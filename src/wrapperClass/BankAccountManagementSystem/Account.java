package wrapperClass.BankAccountManagementSystem;

public class Account {
    private Integer accountNumber;
    private String accountHolder;
    private Double balance;

    public Account(Integer accountNumber, String accountHolder, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
        System.out.println("Deposited balance: "+amount);
        System.out.println("Balance after deposit: "+balance);
    }
    public void withdraw(Double amount) {
        if (amount>0 && amount<=balance) {
            balance -= amount;
            System.out.println("Withdrawing balance: "+amount);
            System.out.println("Balance after withdraw: " + balance);
        }
        else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
