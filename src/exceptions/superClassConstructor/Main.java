package exceptions.superClassConstructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial pay balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialBalance);

        try {
            System.out.println("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            bankAccount.deposit(depositAmount);
            System.out.println("Deposit successful. Current balance: "+bankAccount.getBalance());

            System.out.println("Enter withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();
            bankAccount.withdraw(withdrawAmount);
            System.out.println("Withdraw successful. Current balance: "+bankAccount.getBalance());

            System.out.println("Enter withdraw amount: ");
            double withdrawAmountAgain = scanner.nextDouble();
            bankAccount.withdraw(withdrawAmountAgain);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: "+e.getMessage());
        } catch (InsufficientFundException e) {
            System.err.println("Error: "+e.getMessage());
        } finally {
            System.out.println("Final Balance: "+bankAccount.getBalance());
        }
    }
}
