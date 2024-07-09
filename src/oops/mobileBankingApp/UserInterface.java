package oops.mobileBankingApp;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Account account;
    private AuthenticationService authService;

    public UserInterface(Account account, AuthenticationService authService) {
        this.scanner = new Scanner(System.in);
        this.account = account;
        this.authService = authService;
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Mobile Bank!");
    }

    public boolean performLogin() {
        System.out.println("Enter username: ");
        String username = this.scanner.nextLine();
        System.out.println("Enter password: ");
        String password = this.scanner.nextLine();
        return this.authService.authenticate(username, password);
    }

    public void showDashboard() {
        System.out.println("\nAccount Dashboard:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = this.scanner.nextInt();
        switch (choice) {
            case 1:
                this.checkBalance();
                break;
            case 2:
                this.withdraw();
                break;
            case 3:
                System.out.println("Exiting Mobile Bank...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                this.showDashboard();
        }

    }

    private void checkBalance() {
        System.out.println("\nYour current balance is: $" + this.account.getBalance());
    }

    private void withdraw() {
        System.out.println("\nWithdraw");
        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = this.scanner.nextDouble();
        if (!this.account.withdraw(withdrawAmount)) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal successful. New balance: $" + this.account.getBalance());
        }

        this.showDashboard();
    }
}

