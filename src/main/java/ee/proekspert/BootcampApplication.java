package ee.proekspert;

import ee.proekspert.Domain.QuestionEntity;
import ee.proekspert.Repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication implements CommandLineRunner {


	private final QuestionRepository repository;

	BootcampApplication(QuestionRepository repository){
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (QuestionEntity questions : repository.findAll()) {
			System.out.println(questions);
		}
	}

}