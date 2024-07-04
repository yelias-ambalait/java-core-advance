package inheritance.bank;

public class Main {
    public static void main(String[] args) {
        BankManagement bankManagement = new BankManagement();

        SavingsAccount sa = new SavingsAccount("03512100020533", "John Doe", 5000, 7.5);
        BusinessAccount ba = new BusinessAccount("03512100020534", "Adam Smith", 8500);
        bankManagement.addAccount(sa);
        bankManagement.addAccount(ba);
        bankManagement.displayAllAccounts();

        sa.deposit(4000);
        sa.addInterest();
        sa.withdraw(4500);

        ba.deposit(2000);

        ba.withdraw(5500);
    }
}
