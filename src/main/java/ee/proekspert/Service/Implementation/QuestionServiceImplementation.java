package ee.proekspert.Service.Implementation;

import ee.proekspert.DTO.QuestionDTO;
import ee.proekspert.Domain.GameEntity;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Repository.GameRepository;
import ee.proekspert.Repository.QuestionRepository;
import ee.proekspert.Service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementation implements QuestionService {
    private final QuestionRepository repository;
    private final GameRepository gameRepository;

    public QuestionServiceImplementation(QuestionRepository repository, GameRepository gameRepository) {
        this.repository = repository;
        this.gameRepository = gameRepository;
    }

    @Override
    public QuestionDTO createQuestion(QuestionDTO question) {
        return null;
    }

    @Override
    public List<QuestionEntity> getAllQuestions() {
        return repository.findAll();
    }

    @Override
    public String createNewGame() {
        GameEntity newGame = new GameEntity();
        gameRepository.save(newGame);
        return newGame.getId();
    }

    @Override
    public QuestionDTO sendQuestionInBeginningOfGame() {
        QuestionEntity question = repository.findByQuestionNumber("1");
        QuestionDTO questionDTO = new QuestionDTO();
        BeanUtils.copyProperties(question, questionDTO);
        return questionDTO;

    }


}
