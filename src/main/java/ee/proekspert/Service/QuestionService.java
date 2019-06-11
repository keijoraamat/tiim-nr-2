package ee.proekspert.Service;


import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.Domain.QuestionEntity;

import java.util.List;

public interface QuestionService {

    List<QuestionEntity> getAllQuestionsFromDatabase();

    QuestionSendDTO sendFirstQuestion();
}
