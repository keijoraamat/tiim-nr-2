package ee.proekspert.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuestionDto implements Serializable {
    private static final long serialVersionUID = 4865903039190150346L;
    private String id;
    //private String questionId;
    private String questionText;
    private String correctAnswer;
    private List<String> allAnswers = new ArrayList<>();
    private String informationText;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
