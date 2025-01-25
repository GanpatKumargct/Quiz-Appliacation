package com.Ganpat.QuizApplication.Controller;

import com.Ganpat.QuizApplication.Entity.Question;
import com.Ganpat.QuizApplication.Entity.Quizquestion;
import com.Ganpat.QuizApplication.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/home")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/home")
    public String HomePage(){
        return "Welcome to Quiz application";
    }

    @GetMapping("/questions")
    public List<Quizquestion> getquestion(){
        return questionService.getAllQuestion();
    }


    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public Quizquestion saveQuestion(@RequestBody Quizquestion quizquestion){
        return questionService.saveQuestion(quizquestion);
    }
}
