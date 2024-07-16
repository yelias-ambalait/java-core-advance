package controlFlow.loops.doWhileLoop.ValidatingUserInput;

import java.util.Scanner;

public class UserInputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Enter valid password( at least 8 characters, contains one number): ");
            password = scanner.nextLine();
        } while (!isValidPassword(password));

        System.out.println("Password accepted.");
        scanner.close();
    }

    private static boolean isValidPassword(String password) {

        return password.length() >=8 && password.matches(".*\\d.*");
    }
}

