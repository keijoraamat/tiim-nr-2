package ee.proekspert;

import ee.proekspert.Domain.GameEntity;
import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Repository.GameRepository;
import ee.proekspert.Repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication implements CommandLineRunner {


	private final QuestionRepository repository;

	BootcampApplication(QuestionRepository repository, GameRepository gameRepository){
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//repository.deleteAll();

		// save a couple of Answers
		//repository.save(new QuestionEntity( "1","Question 1", "Correct Answer 1", "Answer 1.1", "Answer 1.2", "Answer 1.3", "Correct Answer 1", "Lorem Ipsum 1"));
		//repository.save(new QuestionEntity( "2","Question 2", "Correct Answer 2", "Answer 2.1", "Correct Answer 2", "Answer 2.3", "Answer 2.4", "Lorem Ipsum 1"));
		//gameRepository.save(new GameEntity());
		for (QuestionEntity questions : repository.findAll()) {
			System.out.println(questions);
		}
		System.out.println();

		System.out.println(repository.findById("5cf76e67711bb23ca4268623"));

	}

}