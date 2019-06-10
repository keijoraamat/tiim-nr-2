package ee.proekspert.Service;

import ee.proekspert.DTO.QuestionDTO;
import ee.proekspert.Domain.QuestionEntity;

import java.util.List;

public interface QuestionService {
    QuestionDTO createQuestion(QuestionDTO question);
    List<QuestionEntity> getAllQuestions();
    String createNewGame();
    QuestionDTO sendQuestionInBeginningOfGame();
}
