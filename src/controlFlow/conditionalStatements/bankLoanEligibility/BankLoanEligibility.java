package controlFlow.conditionalStatements.bankLoanEligibility;

import java.util.Scanner;

public class BankLoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loanType;
        int creditScore;
        double monthlyIncome;
        boolean isEligible = false;

        System.out.println("Enter loan type: ");
        loanType = scanner.nextLine();
        System.out.println("Enter credit score: ");
        creditScore = scanner.nextInt();
        System.out.println("Enter monthly income: ");
        monthlyIncome = scanner.nextDouble();

        if (loanType.equals("Personal Loan")) {
            if (creditScore >= 700 && monthlyIncome >= 30000) {
                isEligible = true;
            } else {
                isEligible = false;
            }
        } else if (loanType.equals("Home Loan")) {
            if (creditScore >= 750) {
                if (monthlyIncome >= 40000) {
                    isEligible = true;
                } else {
                    isEligible = false;
                }
            } else {
                isEligible = false;
            }
        } else if (loanType.equals("Car Loan")) {
            if (creditScore >= 780 && monthlyIncome >= 25000) {
                isEligible = true;
            } else {
                isEligible = false;
            }
        } else {
            System.out.println("Invalid Loan type.");
        }
        if (isEligible) {
            System.out.println("You are eligible for the " + loanType + ".");
        } else {
            System.out.println("You are not eligible for the " + loanType + ".");
        }
    }
}
