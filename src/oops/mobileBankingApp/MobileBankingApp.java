package oops.mobileBankingApp;

public class MobileBankingApp {
    public MobileBankingApp() {
    }

    public static void main(String[] args) {
        Account account = new Account(1000.0);
        AuthenticationService authService = new AuthenticationService();
        UserInterface ui = new UserInterface(account, authService);
        ui.displayWelcomeMessage();
        if (ui.performLogin()) {
            ui.showDashboard();
        } else {
            System.out.println("Login failed. Exiting Mobile Bank.");
        }

    }
}
