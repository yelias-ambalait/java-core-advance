package controlFlow.loops.doWhileLoop.menuDrivenProgram;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Item");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding Item");
                    break;

                case 2:
                    System.out.println("Removing Item");
                    break;

                case 3:
                    System.out.println("View Item");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        s.close();
    }
}
