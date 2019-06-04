package ee.proekspert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class Controller {

    Service service = new Service();

    @GetMapping("/question/{id}")
    Question question(@PathVariable int id) {
        if (id > 0 && id < 11) {
            return service.getQuestion(id);
        }
        return null;
    }

    @PostMapping("/answer")
    String answerQuestion(@RequestBody String answer) {
        return answer + "correct";
    }


}
