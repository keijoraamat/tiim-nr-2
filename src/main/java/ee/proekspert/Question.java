package ee.proekspert;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Question {
    private int id;
    private String questionText;
    private String informationText;


    public Question(int id, String questionText, String informationText) {
        this.id = id;
        this.questionText = questionText;
        this.informationText = informationText;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getInformationText() {
        return informationText;
    }

}
