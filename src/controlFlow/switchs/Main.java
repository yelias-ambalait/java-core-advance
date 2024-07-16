package controlFlow.switchs;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1111189195256", "Nuh", 50000);
        ATM atm = new ATM(bankAccount);
        atm.atmMenu();

    }
}
