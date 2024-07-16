package controlFlow.conditionalStatements.onlineStoreDiscount;

import java.util.Scanner;

public class OnlineStoreDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter membership level: ");
        String membershipLevel = scanner.next();

        System.out.println("Enter purchase amount: ");
        int purchaseAmount = scanner.nextInt();

        double discount = 0;

        if (membershipLevel.equalsIgnoreCase("Regular")) {
            discount = 0.05;
        } else if (membershipLevel.equalsIgnoreCase("Gold")) {
            discount = 0.10;
        } else if (membershipLevel.equalsIgnoreCase("Platinum")) {
            discount = 0.15;
        } else {
            System.out.println("Invalid membership level.");
        }

        double discountAmount = purchaseAmount * discount;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Purchase amount: "+purchaseAmount);
        System.out.println("Discount amount: "+discountAmount);
        System.out.println("Final amount: "+finalAmount);
    }
}
