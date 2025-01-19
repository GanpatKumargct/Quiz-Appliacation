package com.Ganpat.QuizApplication.Controller;

import com.Ganpat.QuizApplication.Entity.Question;
import com.Ganpat.QuizApplication.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/home")
    public void HomePage(){
        System.out.println("Welcome Quiz...");
    }

    @GetMapping("/questions")
    public List<Question> getQuestion(){
        return questionService.AllQuestions();
    }
}
