package ee.proekspert.DTO;

import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.List;

public class QuestionDTO {

    private String id;

    private String questionText;

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
