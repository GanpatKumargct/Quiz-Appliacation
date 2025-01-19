package com.Ganpat.QuizApplication.Repo;

import com.Ganpat.QuizApplication.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Long> {
}
