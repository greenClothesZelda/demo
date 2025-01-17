package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.QuestionRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
    
    @Autowired
    private AnswerRepository answerRepository;

	@Test
    void testJpa(){
        //this.questionRepository.deleteAll();

        //1번
        // Question q1 = new Question();
        // q1.setSubject("시발");
        // q1.setContent("왜");
        // q1.setCreateDate(LocalDateTime.now());
        // this.questionRepository.save(q1);

        // Question q2 = new Question();
        // q2.setSubject("안되냐고");
        // q2.setContent("대답해라");
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
        // Optional<Question> oq = this.questionRepository.findById(12);
        // assertTrue(oq.isPresent());
        // Question q = oq.get();

        // List<Answer> alist = q.getAnswerList();

        // assertEquals(1, alist.size());
        // assertEquals("ap메이지만 하는 틀딱이라서", alist.get(0).getContent());

        //궁금증
        // Optional<Question> oq = this.questionRepository.findById(58);
        // Question q = oq.get();

        // // List<Answer> aList = this.answerRepository.findAll();
        // // q.setAnswerList(aList);
        // // Answer ans = aList.get(0);
        // // ans.setQuestion(q);
        // // this.answerRepository.save(ans);
        // // this.questionRepository.save(q);

        // this.questionRepository.delete(q);

	}

}
