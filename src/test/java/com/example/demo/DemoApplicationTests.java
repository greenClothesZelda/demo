package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
    
    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
	@Test
    void testJpa(){
        //this.questionRepository.deleteAll();

        //1번
        // Question q1 = new Question();
        // q1.setSubject("sbb는 무엇인가요?");
        // q1.setContent("sbb에 대해 알고싶습니다.");
        // q1.setCreateDate(LocalDateTime.now());
        // this.questionRepository.save(q1);

        // Question q2 = new Question();
        // q2.setSubject("스프링부트 모델 질문입니다.");
        // q2.setContent("id는 자동으로 생성되나요?");
        // q2.setCreateDate(LocalDateTime.now());
        // this.questionRepository.save(q2);



        //2번
        // List<Question> all = this.questionRepository.findAll();
        // assertEquals(8, all.size());

        // Question q = all.get(0);
        // assertEquals("sbb는 무엇인가요?", q.getSubject());
        // Optional<Question> oq = this.questionRepository.findById(1);

        //3번
        // if(oq.isPresent()){
        //     Question q = oq.get();
        //     assertEquals("sbb는 무엇인가요?", q.getSubject());
        // }

        //4번
        // Question q = this.questionRepository.findBySubject("sbb는 무엇인가요?");
        // assertEquals(11, q.getId());

        //5번
        // Question q = this.questionRepository.findBySubjectAndContent("sbb는 무엇인가요?", "sbb에 대해 알고싶습니다.");
        // assertEquals(11, q.getId());

        //6번
        // List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
        // Question q = qList.get(0);
        // assertEquals("sbb는 무엇인가요?", q.getSubject());

        //7번
        // Optional<Question> oq = this.questionRepository.findById(11);
        // assertTrue(oq.isPresent());
        // Question q = oq.get();
        // q.setSubject("대상혁 왜 트타 못함?");
        // this.questionRepository.save(q);
        // q = this.questionRepository.findBySubject("대상혁 왜 트타 못함?");
        // assertEquals(11, q.getId());

        //8번
        // assertEquals(2, this.questionRepository.count());
        // Optional<Question> oq = this.questionRepository.findById(11);
        // assertTrue(oq.isPresent());
        // Question q = oq.get();
        // this.questionRepository.delete(q);
        // assertEquals(1, this.questionRepository.count());

        //9번
        // Optional<Question> oq = this.questionRepository.findById(12);
        // assertTrue(oq.isPresent());
        // Question q = oq.get();

        // Answer ans = new Answer();
        // ans.setContent("ap메이지만 하는 틀딱이라서");
        // ans.setQuestion(q);
        // ans.setCreateDate(LocalDateTime.now());
        // this.answerRepository.save(ans);

        //10번
        Optional<Question> oq = this.questionRepository.findById(12);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> alist = q.getAnswerList();

        assertEquals(1, alist.size());
        assertEquals("ap메이지만 하는 틀딱이라서", alist.get(0).getContent());
	}

}
