package encapsulation;

public class BankAccountManagementSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1118119195300", "Yelias Ahmed", 5000);


        System.out.println("Account details");
        System.out.println("Account number: "+account.getAccountNumber());
        System.out.println("Account Name: "+account.getAccountHolderName());
        System.out.println("Balance: "+account.getBalance());

        account.deposit(500);
        System.out.println("\nCurrent balance after deposit: "+account.getBalance()+"$");

        account.withdraw(2000);
        System.out.println("\nCurrent balance after withdraw: "+account.getBalance()+"$");

        account.withdraw(400);
        System.out.println("\nCurrent balance after withdraw: "+account.getBalance()+"$");
    }
}
