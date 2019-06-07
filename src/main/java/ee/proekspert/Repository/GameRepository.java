package ee.proekspert.Repository;

import ee.proekspert.Domain.GameEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<GameEntity, String> {

}

