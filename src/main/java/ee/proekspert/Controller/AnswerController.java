package ee.proekspert.Controller;

import ee.proekspert.DTO.QuestionDto;
import ee.proekspert.Domain.QuestionRest;
import ee.proekspert.Domain.Questions;
import ee.proekspert.Repository.QuestionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class AnswerController {

    private QuestionRepository repository;


    public AnswerController(QuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Questions> getAllQuestions() {
        return repository.findAll();
    }

    @PostMapping("/newquestion")
    public String createQuestion(@RequestBody String question) {

        return "Hello";
    }



}
