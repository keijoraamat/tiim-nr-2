package ee.proekspert.Service.Implementation;

import ee.proekspert.DTO.QuestionSendDTO;
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
    public QuestionSendDTO sendFirstQuestion() {
        QuestionEntity question = repository.findByQuestionNumber("1");
        QuestionSendDTO questionDTO = new QuestionSendDTO();
        // TODO
        // copy properties manually
        BeanUtils.copyProperties(question, questionDTO);
        return questionDTO;
    }


}
