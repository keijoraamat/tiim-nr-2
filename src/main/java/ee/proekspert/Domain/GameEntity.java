package ee.proekspert.Domain;


import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;


public class GameEntity {


    @Id
    private String id;
    private Boolean finished;
    private int questionsAnswered;
    private Map<String, Boolean> questionDictionary = new HashMap<>();
    private int questionsAnsweredCorrect;

    public GameEntity() {
        this.finished = false;
        this.questionsAnsweredCorrect=0;

    }

    public Map<String, Boolean> getQuestionDictionary() {
        return questionDictionary;
    }

    public void setQuestionDictionary(Map<String, Boolean> questionDictionary) {
        this.questionDictionary = questionDictionary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(int questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }

    public int getQuestionsAnsweredCorrect() {
        return questionsAnsweredCorrect;
    }

    public void setQuestionsAnsweredCorrect(int questionsAnsweredCorrect) {
        this.questionsAnsweredCorrect = questionsAnsweredCorrect;
    }

    @Override
    public String toString() {
        return String.format(
                "GameEntity[id=%s, finished='%s', questionsAnswered='%s', questionsAnsweredCorrect='%s]",
                id, finished, questionsAnswered, questionsAnsweredCorrect);
    }

}