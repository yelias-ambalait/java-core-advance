package oops.mobileBankingWithdraw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            label58: {
                InputStream input = Main.class.getClassLoader().getResourceAsStream("global.properties");

                label59: {
                    try {
                        if (input == null) {
                            System.out.println("Sorry, unable to find config.properties");
                            break label59;
                        }

                        properties.load(input);
                    } catch (Throwable var11) {
                        if (input != null) {
                            try {
                                input.close();
                            } catch (Throwable var10) {
                                var11.addSuppressed(var10);
                            }
                        }

                        throw var11;
                    }

                    if (input != null) {
                        input.close();
                    }
                    break label58;
                }

                if (input != null) {
                    input.close();
                }

                return;
            }
        } catch (IOException var12) {
            var12.printStackTrace();
            return;
        }

        String uname = properties.getProperty("username");
        String pwd = properties.getProperty("password");
        User user = new User(uname, pwd);
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
