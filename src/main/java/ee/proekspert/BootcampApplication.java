package ee.proekspert;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication implements CommandLineRunner {

	@Autowired
	private QuestionRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//repository.deleteAll();

		// save a couple of customers
		//repository.save(new Questions( "Question 1", "Correcr Answer 1", "Wrong 1.1", "Wrong 1.2", "Wrong 1.3", "Lorem Ipsum 1"));
		//repository.save(new Questions( "Question 2", "Correcr Answer 2", "Wrong 2.1", "Wrong 2.2", "Wrong 2.3", "Lorem Ipsum 1"));

		for (Questions questions : repository.findAll()) {
			System.out.println(questions);
		}
		System.out.println();

		System.out.println(repository.findById(new ObjectId("5cf76e39711bb23fc84b9bcd")));

	}

}