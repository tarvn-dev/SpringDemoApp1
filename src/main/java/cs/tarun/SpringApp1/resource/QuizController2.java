package cs.tarun.SpringApp1.resource;

import cs.tarun.SpringApp1.model.Questions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz2")
public class QuizController2 {

    private List<Questions> results;

    //Retrieve data
    @GetMapping
    public List<Questions> getResults(){
        return results;
    }
}
