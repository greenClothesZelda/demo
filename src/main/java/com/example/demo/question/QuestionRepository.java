package com.example.demo.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String Subject);
    Question findBySubjectAndContent(String Subject, String context);
    List<Question> findBySubjectLike(String subject);
}
