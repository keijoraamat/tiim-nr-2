package ee.proekspert.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerEntity {
    String answerId;
    String answerText;
    public AnswerEntity(){}
    public AnswerEntity(String id, String text) {
        this.answerId = id;
        this.answerText = text;
    }
}
