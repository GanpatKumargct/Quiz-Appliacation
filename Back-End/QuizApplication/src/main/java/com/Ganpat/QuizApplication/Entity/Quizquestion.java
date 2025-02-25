package com.Ganpat.QuizApplication.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quizquestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Question;

    private String CorrectAnswer;

    @ElementCollection
    @CollectionTable(name = "question_options", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> Options;

    //gtr str


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return Options;
    }

    public void setOptions(List<String> options) {
        Options = options;
    }

    public Quizquestion(Long id, String question, String correctAnswer, List<String> options) {
        this.id = id;
        Question = question;
        CorrectAnswer = correctAnswer;
        Options = options;
    }

    public Quizquestion() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quizquestion{");
        sb.append("id=").append(id);
        sb.append(", Question='").append(Question).append('\'');
        sb.append(", CorrectAnswer='").append(CorrectAnswer).append('\'');
        sb.append(", Options=").append(Options);
        sb.append('}');
        return sb.toString();
    }
}
