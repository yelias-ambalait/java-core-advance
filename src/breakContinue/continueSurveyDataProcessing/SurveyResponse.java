package breakContinue.continueSurveyDataProcessing;

public class SurveyResponse {
    private int respondentId;
    private double satisfactionScore;

    public SurveyResponse(int respondentId, double satisfactionScore) {
        this.respondentId = respondentId;
        this.satisfactionScore = satisfactionScore;
    }

    public int getRespondentId() {
        return respondentId;
    }

    public double getSatisfactionScore() {
        return satisfactionScore;
    }

    @Override
    public String toString() {
        return "SurveyResponse{" +
                "respondentId=" + respondentId +
                ", satisfactionScore=" + satisfactionScore +
                '}';
    }
}
