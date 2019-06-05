package ee.proekspert;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;


public class Questions {

    @Id
    public ObjectId id;

    public String questionText;
    public String correctAnswer;
    public List<String> wrongAnswers = new ArrayList<>();
    public String informationText;

    public Questions() {}

    public Questions( String questionText, String correctAnswer, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3, String informationText) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers.add(wrongAnswer1);
        this.wrongAnswers.add(wrongAnswer2);
        this.wrongAnswers.add(wrongAnswer3);
        this.informationText = informationText;
    }

    @Override
    public String toString() {
        return String.format(
                "Questions[id=%s, questionText='%s', correctAnswer='%s']",
                id, questionText, correctAnswer);
    }

}
