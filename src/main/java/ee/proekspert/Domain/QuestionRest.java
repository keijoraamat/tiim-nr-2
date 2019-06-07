package ee.proekspert.Domain;


import java.util.ArrayList;
import java.util.List;

public class QuestionRest {

    private String id;
    private String questionText;
    private List<String> allAnswers = new ArrayList<>();
    private String informationText;

    public String getId() {
        return id;
    }
    public String getQuestionText() {
        return questionText;
    }
    public List<String> getAllAnswers() {
        return allAnswers;
    }
    public String getInformationText() {
        return informationText;
    }
}
