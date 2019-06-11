package ee.proekspert.Service.Implementation;

import ee.proekspert.DTO.QuestionNextDTO;
import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.Domain.GameEntity;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Repository.QuestionRepository;
import ee.proekspert.Service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementation implements QuestionService {
    private final QuestionRepository repository;

    public QuestionServiceImplementation(QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<QuestionEntity> getAllQuestionsFromDatabase() {
        return repository.findAll();
    }


    @Override
    public QuestionSendDTO startNewGameAndSendFirstQuestion() {
        GameEntity newGame = new GameEntity();
        QuestionEntity question = repository.findByQuestionNumber("1");
        QuestionSendDTO questionDTO = new QuestionSendDTO();
        BeanUtils.copyProperties(question, questionDTO);
        questionDTO.setGameId(newGame.getId());
        return questionDTO;
    }

    @Override
    public QuestionSendDTO sendNextQuestion(QuestionNextDTO questionNumber) {
        QuestionEntity nextQuestion = repository.findByQuestionNumber(questionNumber.getQuestionNumber());
        QuestionSendDTO questionSendDTO = new QuestionSendDTO();
        BeanUtils.copyProperties(nextQuestion, questionSendDTO);
        questionSendDTO.setGameId(questionNumber.getGameId());

        return questionSendDTO;
    }


}
