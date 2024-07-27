package exceptions.uncheckedExceptions;

import java.util.Scanner;

// Unchecked exception
public class ArithmeticException {

    public static int divisionByZeroException(int a, int b) {
        return a/b;     //division by zero
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(divisionByZeroException(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
