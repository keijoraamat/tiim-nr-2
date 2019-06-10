package ee.proekspert.DTO;

import java.util.ArrayList;
import java.util.List;

public class QuestionCreateDTO {

    private String questionNumber;
    private String questionText;
    private String correctAnswer;
    private List<String> allAnswers = new ArrayList<>();
    private String informationText;

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }


    public List<String> getAllAnswers() {
        return allAnswers;
    }

    public void setAllAnswers(List<String> allAnswers) {
        this.allAnswers = allAnswers;
    }

    public List<String> getWrongAnswers() {
        return allAnswers;
    }

    public void setWrongAnswers(List<String> Allanswers) {
        this.allAnswers = Allanswers;
    }

    public String getInformationText() {
        return informationText;
    }

    public void setInformationText(String informationText) {
        this.informationText = informationText;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}