package ee.proekspert.Service;


import ee.proekspert.DTO.QuestionNextDTO;
import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.DTO.QuestionUpdateDTO;
import ee.proekspert.Domain.QuestionEntity;

import java.util.List;

public interface QuestionService {

    List<QuestionEntity> getAllQuestionsFromDatabase();
    QuestionSendDTO startNewGameAndSendFirstQuestion();
    String updateQuestionDictionary(QuestionUpdateDTO questionUpdateDTO);
    QuestionSendDTO sendNextQuestion(QuestionNextDTO questionNumber);
}
