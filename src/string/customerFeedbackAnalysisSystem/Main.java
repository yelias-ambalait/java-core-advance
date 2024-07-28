package string.customerFeedbackAnalysisSystem;

public class Main {
    public static void main(String[] args) {
        FeedbackAnalyzer feedbackAnalyzer = new FeedbackAnalyzer();
        feedbackAnalyzer.addFeedback("Excellent product. I loved it.");
        feedbackAnalyzer.addFeedback("The service was good, but the product quality was bad.");
        feedbackAnalyzer.addFeedback("Good value for money.");
        feedbackAnalyzer.addFeedback("Not satisfied with the delivery time.");

        System.out.println("Total Feedback Count: " + feedbackAnalyzer.totalFeedbackCount());


        feedbackAnalyzer.analyzeFeedback();
    }
}
