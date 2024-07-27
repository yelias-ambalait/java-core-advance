package exceptions.mixedTypeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        try {
            System.out.println("Enter new account number: ");
            String accountNumber1 = scanner.next();
            System.out.println("Enter initial amount: ");
            double amountFirst = scanner.nextDouble();
            bank.createAccount(accountNumber1, amountFirst);
            System.out.println("Current balance of "+accountNumber1+" : "+bank.getBalance(accountNumber1));

            System.out.println("Enter new account number: ");
            String accountNumber2 = scanner.next();
            System.out.println("Enter initial amount: ");
            double amountSecond = scanner.nextDouble();
            bank.createAccount(accountNumber2, amountSecond);
            System.out.println("Current balance of "+accountNumber2+" :"+bank.getBalance(accountNumber1));

            System.out.println("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            bank.deposit(accountNumber2, depositAmount);
            System.out.println("Balance of "+accountNumber2+" after deposit: "+bank.getBalance(accountNumber2));

            System.out.println("Enter withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();
            bank.withdraw(accountNumber2, withdrawAmount);
            System.out.println("Current balance of "+accountNumber2+" after withdraw: "+bank.getBalance(accountNumber2));

            System.out.println("Enter transfer amount: ");
            double transferAmount = scanner.nextDouble();
            bank.transfer(accountNumber1, accountNumber2, transferAmount);
            System.out.println("Balance of "+accountNumber1+" after transfer: "+bank.getBalance(accountNumber1));
            System.out.println("Balance of "+accountNumber2+" after transfer: "+bank.getBalance(accountNumber2));

            bank.deposit("111568968", 500);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.err.println("Error: "+e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: "+e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }

    }
}
