package oops.mba;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        User user = new User("user", "pass");
        Account account = new Account(1000.0);
        MobileBankingApp app = new MobileBankingApp(user, account);
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