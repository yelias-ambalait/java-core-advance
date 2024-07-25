package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double balance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(balance);
        System.out.println("Balance: "+balance);
       try {
           System.out.println("Enter deposit amount: ");
           double depositAmount = scanner.nextDouble();
           bankAccount.deposit(depositAmount);
           System.out.println(depositAmount+" Deposit successful. Current balance: "+bankAccount.getBalance());

           System.out.println("Enter withdraw amount: ");
           double withdrawAmount = scanner.nextDouble();
           bankAccount.withdraw(withdrawAmount);
           System.out.println("Withdraw successful. Current balance: "+bankAccount.getBalance());
           System.out.println("Enter withdraw amount: ");
           double withdrawAgain = scanner.nextDouble();
           bankAccount.withdraw(withdrawAgain);
       } catch (IllegalArgumentException e) {
           System.err.println("Error: "+e.getMessage());
       } catch (InsufficientFundsException e) {
           System.err.println("Error: "+e.getMessage());
       } finally {
           System.out.println("Final balance: "+bankAccount.getBalance());
       }

    }
}
