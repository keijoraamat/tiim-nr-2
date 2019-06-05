package ee.proekspert;

import java.util.List;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Questions, ObjectId> {

}
