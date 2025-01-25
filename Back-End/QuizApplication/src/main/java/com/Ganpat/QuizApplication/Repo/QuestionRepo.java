package com.Ganpat.QuizApplication.Repo;

import com.Ganpat.QuizApplication.Entity.Quizquestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Quizquestion,Long> {
}
