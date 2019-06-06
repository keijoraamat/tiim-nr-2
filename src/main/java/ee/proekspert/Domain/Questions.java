package ee.proekspert.Domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;


public class Questions {

    @Id
    private ObjectId id;

    private String questionText;
    private String correctAnswer;
    private List<String> allAnswers = new ArrayList<>();
    private String informationText;

    public Questions() {}

    public Questions( String questionText, String correctAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3, String informationText) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.allAnswers.add(wrongAnswer1);
        this.allAnswers.add(wrongAnswer2);
        this.allAnswers.add(wrongAnswer3);
        this.allAnswers.add(correctAnswer);
        this.informationText = informationText;
    }

    public ObjectId getId() {
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


    public List<String> getWrongAnswers() {
        return allAnswers;
    }

    public void setWrongAnswers(List<String> wrongAnswers) {
        this.allAnswers = wrongAnswers;
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
                "Questions[id=%s, questionText='%s', correctAnswer='%s']",
                id, questionText, correctAnswer);
    }

}
