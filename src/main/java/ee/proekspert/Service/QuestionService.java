package ee.proekspert.Service;

import ee.proekspert.DTO.QuestionCreateDTO;
import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.Domain.QuestionEntity;

import java.util.List;

public interface QuestionService {
   String createQuestion(QuestionCreateDTO question);
    List<QuestionEntity> getAllQuestions();
    QuestionSendDTO startNewGameAndSendFirstQuestion();
}
