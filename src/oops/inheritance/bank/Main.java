package oops.inheritance.bank;

public class Main {
    public static void main(String[] args) {
        BankManagement bankManagement = new BankManagement();

        SavingsAccount savingsAccount = new SavingsAccount("03512100020533", "John Doe", 5000, 7.5);
        BusinessAccount businessAccount = new BusinessAccount("03512100020534", "Adam Smith", 8500, 18000);
        bankManagement.addAccount(savingsAccount);
        bankManagement.addAccount(businessAccount);
        bankManagement.displayAllAccounts();

        savingsAccount.deposit(4000);
        savingsAccount.addInterest();
        savingsAccount.withdraw(4500);

        businessAccount.deposit(2000);
        businessAccount.repayLoan(1000);
        businessAccount.withdraw(5500);

    }
}
