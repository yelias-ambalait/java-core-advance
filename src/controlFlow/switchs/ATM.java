package controlFlow.switchs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void atmMenu() {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;

                case 2:
                    try {
                        System.out.println("Enter withdraw amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        bankAccount.withdraw(withdrawAmount);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println(e);
                        System.out.println("Invalid input. Please enter current input.");
                        break;
                    }

                case 3:
                    bankAccount.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
