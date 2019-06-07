package ee.proekspert.Repository;


import ee.proekspert.Domain.QuestionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<QuestionEntity, String> {

}
