package controlFlow.loops.doWhileLoop.userAuthentication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthentication {

    private Map<String, String> users = new HashMap<>();
    public UserAuthentication() {
        users.put("Tom", "tom123");
        users.put("John", "john123");
        users.put("Smith", "smith123");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public void startAuthentication() {
        Scanner scanner = new Scanner(System.in);
        boolean authenticated = false;

        do {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            authenticated = authenticate(username, password);
            if(!authenticated) {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while(!authenticated);

        System.out.println("Authentication successful. Welcome!");
    }

    public static void main(String[] args) {
        UserAuthentication userAuthentication = new UserAuthentication();
        userAuthentication.startAuthentication();
    }
}
