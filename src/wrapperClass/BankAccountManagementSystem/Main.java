package wrapperClass.BankAccountManagementSystem;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount(12120533, "Ibrahim", 1500.0);
        bank.createAccount(12120535, "Ismail", 1100.0);

        System.out.println("Ibrahim's account details");
        System.out.println("Current Balance: "+bank.getBalance(12120533));
        bank.deposit(12120533, 700.00);
        bank.withdraw(12120533, 350.0);

        System.out.println("\nIsmail's account details");
        System.out.println("Current Balance: "+bank.getBalance(12120535));
        bank.deposit(12120535, 400.00);
        bank.withdraw(12120535, 250.0);

        System.out.println("\n\nTransaction history of Ibrahim:");
        for (Transaction transaction : bank.getTransactionHistory(12120533)) {
            System.out.println(
                    "Account number: "+transaction.getAccountNumber()
                    +"\nTransaction ID: "+transaction.getTransactionId()
                    +"\nAmount: "+transaction.getTransactionAmount()
                    +"\nDate: "+transaction.getDate()
                    +"\nTransaction Type: "+transaction.getType()
            );
        }


    }
}
