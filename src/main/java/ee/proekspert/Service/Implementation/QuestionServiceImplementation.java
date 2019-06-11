package ee.proekspert.Service.Implementation;

import ee.proekspert.DTO.QuestionCreateDTO;
import ee.proekspert.DTO.QuestionNextDTO;
import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.DTO.QuestionUpdateDTO;
import ee.proekspert.Domain.GameEntity;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Repository.GameRepository;
import ee.proekspert.Repository.QuestionRepository;
import ee.proekspert.Service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImplementation implements QuestionService {
    private final QuestionRepository repository;
    private final GameRepository gameRepository;

    public QuestionServiceImplementation(QuestionRepository repository, GameRepository gameRepository) {
        this.repository = repository;
        this.gameRepository = gameRepository;
    }

    @Override
    public String addNewQuestionToDatabase(QuestionCreateDTO question) {
        QuestionEntity newQuestion = new QuestionEntity();
        BeanUtils.copyProperties(question, newQuestion);
        repository.save(newQuestion);
        return "New Question Created!";
    }

    @Override
    public List<QuestionEntity> getAllQuestionsFromDatabase() {
        return repository.findAll();
    }


    @Override
    public QuestionSendDTO startNewGameAndSendFirstQuestion() {
        GameEntity newGame = new GameEntity();
        gameRepository.save(newGame);
        QuestionEntity question = repository.findByQuestionNumber("1");
        QuestionSendDTO questionDTO = new QuestionSendDTO();
        BeanUtils.copyProperties(question, questionDTO);
        questionDTO.setGameId(newGame.getId());
        return questionDTO;
    }

    @Override
    public String updateQuestionDictionary(QuestionUpdateDTO questionUpdateDTO) {
        QuestionEntity question = repository.findByQuestionNumber(questionUpdateDTO.getQuestionNumber());
        Optional<GameEntity> game = gameRepository.findById(questionUpdateDTO.getGameId());
        if (question.getCorrectAnswer().equals(questionUpdateDTO.getAnswer())){
            game.ifPresent(gameEntity -> gameEntity.getQuestionDictionary().put(questionUpdateDTO.getQuestionNumber(), true));
            gameRepository.save(game.get());
        }else {
            game.ifPresent(gameEntity -> gameEntity.getQuestionDictionary().replace(questionUpdateDTO.getQuestionNumber(), false));
            gameRepository.save(game.get());
        }
        return "Question " + questionUpdateDTO.getQuestionNumber() + " updated.";

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
