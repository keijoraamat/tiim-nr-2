package ee.proekspert.DTO;

public class QuestionUpdateDTO {
    private String gameId;
    private String questionNumber;
    private String answer;


    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
