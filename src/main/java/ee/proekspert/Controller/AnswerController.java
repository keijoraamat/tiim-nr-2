package ee.proekspert.Controller;

import ee.proekspert.DTO.TestDTO;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Domain.QuizGame;
import ee.proekspert.Domain.TestEntity;
import ee.proekspert.Repository.QuestionRepository;
import ee.proekspert.Service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class AnswerController {

    private QuestionRepository repository;
    private QuestionService questionService;
    private QuizGame game;

    public AnswerController(QuestionRepository repository, QuestionService questionService) {
        this.repository = repository;
        this.questionService = questionService;
    }

    @GetMapping("/allquestions")
    public List<QuestionEntity> getAllQuestions() {
        return repository.findAll();
    }

    @PostMapping("/newgame")
    public String createNewGame(@RequestBody String newGame) {
        if (!newGame.isEmpty() && newGame.equals("Start Game")){
            game = new QuizGame();
            return "GAME CREATED";
        }
        else return "Something went wrong";

    }

    @PostMapping("/nextquestion")
    public String createQuestion(@RequestBody QuizGame continueGame) {
        return "Hello";

    }

    @PostMapping("/test")
    public TestEntity createTest(@RequestBody TestDTO testInfo) {
        //ModelMapper modelMapper = new ModelMapper();
        //TestEntity testEntity = modelMapper.map(testInfo,TestEntity.class);
        //testEntity.setId("125");
        TestEntity testEntity = new TestEntity();
        BeanUtils.copyProperties(testInfo,testEntity);
        testEntity.setText("Hahaha");

        return testEntity;
    }



}
