package controlFlow.loops.doWhileLoop;

import java.util.Scanner;

public class ATM_Pin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPin = "1234";
        String enteredPin;

        do {
            System.out.println("Enter your correctPin: ");
            enteredPin = scanner.nextLine();

            if (!enteredPin.equals(correctPin)) {
                System.out.println("Incorrect PIN. Please try again.");
            }
        } while(!enteredPin.equals(correctPin));

        System.out.println("PIN Accepted. Welcome to your account dashboard.");
        scanner.close();
    }
}
