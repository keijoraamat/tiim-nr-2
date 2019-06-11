package ee.proekspert.Domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class QuestionEntity {

    @Id
    private String id;
    private String questionText;
    private String correctAnswer;
    private List<AnswerEntity> allAnswers = new ArrayList<>();
    private String informationText;

    public QuestionEntity() {
        this.id = "1";
        this.questionText = "fjdklsfjsl";
        this.correctAnswer = "fdlögjöööööö";
        this.allAnswers.add(new AnswerEntity("1", "Text1"));
        this.allAnswers.add(new AnswerEntity("2", "Text2"));
        this.allAnswers.add(new AnswerEntity("3", "Text3"));
        this.allAnswers.add(new AnswerEntity("4", "Text4"));
    }

    public QuestionEntity(String id, String questionText, String correctAnswer, AnswerEntity Answer1, AnswerEntity Answer2, AnswerEntity Answer3, AnswerEntity Answer4, String informationText) {
        this.id = id;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.allAnswers.add(new AnswerEntity("1", "Text1"));
        this.allAnswers.add(new AnswerEntity("2", "Text2"));
        this.allAnswers.add(new AnswerEntity("3", "Text3"));
        this.allAnswers.add(new AnswerEntity("4", "Text4"));
        this.informationText = informationText;
    }


    @Override
    public String toString() {
        return String.format(
                "QuestionEntity[id=%s, questionText='%s', correctAnswer='%s']",
                id, questionText, correctAnswer);
    }

}
