package controlFlow.loops.doWhileLoop.surveyAppFeedback;

import java.util.Scanner;

public class SurveyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String feedback;

        do {
            System.out.println("Please provide your feedback: ");
            feedback = scanner.nextLine();

            if (!feedback.equalsIgnoreCase("finish")) {
                System.out.println("Thanks for your feedback."+ feedback);
            }
        } while (!feedback.equalsIgnoreCase("finish"));

        System.out.println("Thank you for completing your survey!!");
        scanner.close();
    }
}
