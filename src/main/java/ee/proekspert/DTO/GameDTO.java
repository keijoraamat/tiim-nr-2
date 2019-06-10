package ee.proekspert.DTO;

public class GameDTO {
    private String gameId;
    private String previousQuestionId;
    private int previousQuestion;
    private String nextQuestionId;
    private int nextQuestion;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getPreviousQuestionId() {
        return previousQuestionId;
    }

    public void setPreviousQuestionId(String previousQuestionId) {
        this.previousQuestionId = previousQuestionId;
    }

    public int getPreviousQuestion() {
        return previousQuestion;
    }

    public void setPreviousQuestion(int previousQuestion) {
        this.previousQuestion = previousQuestion;
    }

    public String getNextQuestionId() {
        return nextQuestionId;
    }

    public void setNextQuestionId(String nextQuestionId) {
        this.nextQuestionId = nextQuestionId;
    }

    public int getNextQuestion() {
        return nextQuestion;
    }

    public void setNextQuestion(int nextQuestion) {
        this.nextQuestion = nextQuestion;
    }
}
