package ee.proekspert.Controller;

import ee.proekspert.DTO.*;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Service.QuestionService;
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
        return questionService.getAllQuestionsFromDatabase();
    }

    @PostMapping("/create_question")
    public String createNewQuestion(@RequestBody QuestionCreateDTO newQuestion){
        return questionService.addNewQuestionToDatabase(newQuestion);
    }
    @PostMapping("/new_game")
    public QuestionSendDTO createNewGame(@RequestBody String newGame) {
        if (!newGame.isEmpty() && newGame.equals("Start Game")){
            return questionService.startNewGameAndSendFirstQuestion();
        }
        else return null;
    }

    @PostMapping("/next_question")
    public QuestionSendDTO sendNewQuestion(@RequestBody QuestionNextDTO nextQuestion) {
        return questionService.sendNextQuestion(nextQuestion);

    }

    @PostMapping("/answer_question")
    public String addAnswerToGameRepository(@RequestBody QuestionUpdateDTO questionUpdateDTO) {
        return questionService.updateQuestionDictionary(questionUpdateDTO);

    }



}
