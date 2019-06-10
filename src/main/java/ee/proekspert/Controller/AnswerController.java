package ee.proekspert.Controller;

import ee.proekspert.DTO.QuestionCreateDTO;
import ee.proekspert.DTO.QuestionSendDTO;
import ee.proekspert.DTO.TestDTO;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.DTO.GameDTO;
import ee.proekspert.Domain.TestEntity;
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

    @GetMapping("/all_questions")
    public List<QuestionEntity> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/create_question")
    public String createNewQuestion(@RequestBody QuestionCreateDTO newQuestion){
        return questionService.createQuestion(newQuestion);
    }
    @PostMapping("/new_game")
    public QuestionSendDTO createNewGame(@RequestBody String newGame) {
        if (!newGame.isEmpty() && newGame.equals("Start Game")){
            return questionService.startNewGameAndSendFirstQuestion();
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
