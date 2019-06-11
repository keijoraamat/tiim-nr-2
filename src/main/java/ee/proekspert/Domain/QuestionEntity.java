package ee.proekspert.Domain;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;


public class QuestionEntity {

    @Id
    private String id;
    private String questionNumber;
    private String questionText;
    private String correctAnswer;
    private List<String> allAnswers = new ArrayList<>();
    private String informationText;

    public QuestionEntity() {}

    public QuestionEntity(String questionNumber,String questionText, String correctAnswer, String Answer1, String Answer2, String Answer3, String Answer4, String informationText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.allAnswers.add(Answer1);
        this.allAnswers.add(Answer2);
        this.allAnswers.add(Answer3);
        this.allAnswers.add(Answer4);
        this.informationText = informationText;
    }

    public String getId() {
        return id;
    }


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

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAllAnswers() {
        return allAnswers;
    }

    public void setAllAnswers(List<String> allAnswers) {
        this.allAnswers = allAnswers;
    }

    public String getInformationText() {
        return informationText;
    }

    public void setInformationText(String informationText) {
        this.informationText = informationText;
    }

    @Override
    public String toString() {
        return String.format(
                "QuestionEntity[id=%s, questionText='%s', correctAnswer='%s']",
                id, questionText, correctAnswer);
    }

}
