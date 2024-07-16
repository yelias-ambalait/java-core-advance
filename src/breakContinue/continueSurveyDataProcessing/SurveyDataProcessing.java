package breakContinue.continueSurveyDataProcessing;

import java.util.ArrayList;
import java.util.List;

public class SurveyDataProcessing {
    public static void main(String[] args) {
        List<SurveyResponse> responses = new ArrayList<>();
        responses.add(new SurveyResponse(1, 5));
        responses.add(new SurveyResponse(2, 4.5));
        responses.add(new SurveyResponse(3, 4.5));
        responses.add(new SurveyResponse(4, 7));
        responses.add(new SurveyResponse(5, 4.5));

        int totalScore = 0;
        int validResponsesCount = 0;

        for (SurveyResponse response : responses) {
            double score = response.getSatisfactionScore();

            if (score<1 || score>5) {
                System.out.println("Skipping invalid response"+response);
                continue;
            }
            totalScore += score;
            validResponsesCount++;
        }

        double averageScore = (double) totalScore/validResponsesCount;
        System.out.printf("Average satisfaction score: %.2f", averageScore);
    }
}
