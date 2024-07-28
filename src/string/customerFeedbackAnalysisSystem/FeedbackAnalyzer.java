package string.customerFeedbackAnalysisSystem;

import java.util.ArrayList;
import java.util.List;

public class FeedbackAnalyzer {
    private List<String> feedbacks;
    public FeedbackAnalyzer() {
        feedbacks = new ArrayList<String>();
    }
    public void addFeedback(String feedback) {
        feedbacks.add(feedback);
    }
    public int totalFeedbackCount() {
        return feedbacks.size();
    }
    public String getFeedbackAt(int index) {
        if (index < 0 || index >= feedbacks.size()) {
            return "invalid feedback";
        }
        return feedbacks.get(index);
    }
    public void analyzeFeedback() {
        for (String feedback : feedbacks) {
            System.out.println("Original feedback: " + feedback);
            System.out.println("Lowercase: " + feedback.toLowerCase());
            System.out.println("Uppercase: " + feedback.toUpperCase());
            System.out.println("Trimmed: " + feedback.trim());
            System.out.println("Length: " + feedback.length());
            System.out.println("First character: " + feedback.charAt(0));
            System.out.println("Last character: " + feedback.charAt(feedback.length() - 1));

            if (feedback.contains("good")) {
                System.out.println("Feedback contains the word 'good'.");
            }

            if (feedback.startsWith("Excellent")) {
                System.out.println("Feedback starts with 'Excellent'.");
            }

            if (feedback.endsWith(".")) {
                System.out.println("Feedback ends with dot(.)");
            }

            int firstOccurrenceOfA = feedback.indexOf('a');
            if (firstOccurrenceOfA != -1) {
                System.out.println("First occurrence of 'a': " + firstOccurrenceOfA);
            }

            String replacedFeedback = feedback.replace("bad", "unfortunate");
            System.out.println("Replaced 'bad' with 'unfortunate': " + replacedFeedback);

            String[] words = feedback.split(" ");
            System.out.println("Words in feedback:");
            for (String word : words) {
                System.out.println(word);
            }

            System.out.println("-----------------------");
        }
    }
}
