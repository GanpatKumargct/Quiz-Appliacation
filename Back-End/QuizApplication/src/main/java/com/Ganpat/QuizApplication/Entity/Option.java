package com.Ganpat.QuizApplication.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long optionId;
    private String questionTest;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    public long getOptionId() {
        return optionId;
    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getQuestionTest() {
        return questionTest;
    }

    public void setQuestionTest(String questionTest) {
        this.questionTest = questionTest;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}


