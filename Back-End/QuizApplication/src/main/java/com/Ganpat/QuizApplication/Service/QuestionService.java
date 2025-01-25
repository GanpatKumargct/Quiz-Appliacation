package com.Ganpat.QuizApplication.Service;


import com.Ganpat.QuizApplication.Entity.Question;
import com.Ganpat.QuizApplication.Entity.Quizquestion;
import com.Ganpat.QuizApplication.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Quizquestion> getAllQuestion(){
        List<Quizquestion> quizquestions = questionRepo.findAll();
        return quizquestions;
    }

    public Quizquestion saveQuestion(Quizquestion quizquestion){
        Quizquestion save = questionRepo.save(quizquestion);
        return save;
    }

}
