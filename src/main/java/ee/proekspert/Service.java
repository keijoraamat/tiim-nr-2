package ee.proekspert;

import java.util.ArrayList;
import java.util.List;


public class Service {
    private List<Question> questions = new ArrayList<Question>();

    public Service() {
        questions.add(new Question(1, "Question 1", "Information About Question 1"));
        questions.add(new Question(2, "Question 2", "Information About Question 2"));
        questions.add(new Question(3, "Question 3", "Information About Question 3"));
        questions.add(new Question(4, "Question 4", "Information About Question 4"));
        questions.add(new Question(5, "Question 5", "Information About Question 5"));
        questions.add(new Question(6, "Question 6", "Information About Question 6"));
        questions.add(new Question(7, "Question 7", "Information About Question 7"));
        questions.add(new Question(8, "Question 8", "Information About Question 8"));
        questions.add(new Question(9, "Question 9", "Information About Question 9"));
        questions.add(new Question(10, "Question 10", "Information About Question 10"));
    }

    public Question getQuestion(int index) {
        return questions.get(index - 1);
    }
}
