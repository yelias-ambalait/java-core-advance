package inheritance.bank;

public class BusinessAccount extends Account {

    private double loanBalance;

    public BusinessAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.loanBalance = initialBalance;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void repayLoan(double amount) {
        if (amount > 0 && amount <= loanBalance) {
            loanBalance -= amount;
            System.out.println("Repay loan amount: " + amount + "Remaining loan balance: " + loanBalance);
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Business Account number: " + getAccountNumber() +
                "Account holder: " + getAccountHolderName() +
                " Balance: " + getBalance() +
                " Loan balance: " + loanBalance);
    }
}
