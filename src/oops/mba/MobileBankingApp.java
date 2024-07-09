package oops.mba;

import java.util.Scanner;

public class MobileBankingApp {
    private User user;
    private Account account;
    private boolean isLoggedIn;

    public MobileBankingApp(User user, Account account) {
        this.user = user;
        this.account = account;
        this.isLoggedIn = false;
    }

    public boolean login(String username, String password) {
        if (this.user.authenticate(username, password)) {
            this.isLoggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public void showDashboard() {
        if (!this.isLoggedIn) {
            System.out.println("Please log in first.");
        } else {
            Scanner scanner = new Scanner(System.in);

            while(true) {
                System.out.println("\nAccount Dashboard");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Funds");
                System.out.println("3. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        this.checkBalance();
                        break;
                    case 2:
                        this.withdrawFunds();
                        break;
                    case 3:
                        System.out.println("Logged out.");
                        this.isLoggedIn = false;
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", this.account.getBalance());
    }

    private void withdrawFunds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (!this.account.withdraw(amount)) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Confirm withdraw? (yes/no)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("yes")) {
                System.out.printf("Withdraw successful. Your new balance is: $%.2f%n", this.account.getBalance());
            } else {
                System.out.println("Withdraw canceled.");
            }
        }

    }
}

