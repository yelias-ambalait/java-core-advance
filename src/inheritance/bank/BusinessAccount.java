package inheritance.bank;

public class BusinessAccount extends Account {

    private double loanBalance;

    public BusinessAccount(String accountNumber, String accountHolderName, double initialBalance, double loanBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.loanBalance = loanBalance;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void repayLoan(double amount) {
        if (amount > 0 && amount <= loanBalance) {
            loanBalance -= amount;
            System.out.println("\nRepay loan amount: " + amount + "\nRemaining loan balance: " + loanBalance);
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Business account details"+"\nBusiness Account number: " + getAccountNumber() +
                "\nAccount holder: " + getAccountHolderName() +
                " \nBalance: " + getBalance() +
                " \nLoan balance: " + loanBalance);
    }
}
