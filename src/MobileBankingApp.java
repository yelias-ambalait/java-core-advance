import java.util.Scanner;

class MobileBankingApp {
    private double balance;
    private boolean isLoggedIn;

    public MobileBankingApp(double initialBalance) {
        this.balance = initialBalance;
        this.isLoggedIn = false;
    }

    public boolean login(String username, String password) {
        if (username.equals("user") && password.equals("pass")) {
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
        System.out.printf("Your current balance is: $%.2f%n", this.balance);
    }

    private void withdrawFunds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Confirm withdraw? (yes/no)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("yes")) {
                this.balance -= amount;
                System.out.printf("Withdraw successful. Your new balance is: $%.2f%n", this.balance);
            } else {
                System.out.println("Withdraw canceled.");
            }
        }

    }

    public static void main(String[] args) {
        MobileBankingApp app = new MobileBankingApp(1000.0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        if (app.login(username, password)) {
            System.out.println("Login successful!");
            app.showDashboard();
        } else {
            System.out.println("Invalid username or password.");
        }

    }
}

