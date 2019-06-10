package ee.proekspert.Controller;

import ee.proekspert.DTO.QuestionDTO;
import ee.proekspert.DTO.TestDTO;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.DTO.GameDTO;
import ee.proekspert.Domain.TestEntity;
import ee.proekspert.Repository.QuestionRepository;
import ee.proekspert.Service.Implementation.QuestionServiceImplementation;
import ee.proekspert.Service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class AnswerController {


    private final QuestionService questionService;

    public AnswerController(QuestionService questionService) {

        this.questionService = questionService;
    }

    @GetMapping("/allquestions")
    public List<QuestionEntity> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/newgame")
    public QuestionDTO createNewGame(@RequestBody String newGame) {
        if (!newGame.isEmpty() && newGame.equals("Start Game")){
            return questionService.sendQuestionInBeginningOfGame();
        }
        else return null;

    }

    @PostMapping("/nextquestion")
    public String createQuestion(@RequestBody GameDTO continueGame) {
        return "Hello";

    }

    @PostMapping("/test")
    public TestEntity createTest(@RequestBody TestDTO testInfo) {
        TestEntity testEntity = new TestEntity();
        BeanUtils.copyProperties(testInfo,testEntity);
        testEntity.setText("Hahaha");

        return testEntity;
    }



}
