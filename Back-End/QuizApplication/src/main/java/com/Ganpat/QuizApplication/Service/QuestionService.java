package com.Ganpat.QuizApplication.Service;


import com.Ganpat.QuizApplication.Entity.Question;
import com.Ganpat.QuizApplication.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Question> AllQuestions(){
        List<Question> questionRepoAll = questionRepo.findAll();
        return questionRepoAll;
    }
}
