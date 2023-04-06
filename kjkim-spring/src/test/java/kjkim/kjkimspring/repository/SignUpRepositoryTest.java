package kjkim.kjkimspring.repository;

// 개발한 기능을 테스트할 때 자바의 main 메소드를 통해 실행하거나,
// 웹 애플리케이션의 컨트롤러를 통해서 해당 기능을 실행하는 방법은 비효율(준비 및 실행, 반복 실행과 테스트가 어려움)
// JUnit이라는 프레임워크로 테스트를 실행

import kjkim.kjkimspring.user.SignUp;
import kjkim.kjkimspring.user.SignUpRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // SbbApplicationTests 클래스가 스프링부트 테스트 클래스임을 의미
public class SignUpRepositoryTest {

    @Autowired  // 스프링의 DI 기능으로 SignUpRepository 객체를 스프링이 자동으로 생성
                // DI(의존성 주입 - Dependency Injection): 스프링이 객체를 대신 생성하여 주입
    private  SignUpRepository signUpRepository;

    @Test // testJpa 메소드가 테스트 메소드인 것을 의미
    void testJpa(){
        SignUp user1 = new SignUp();
        user1.setUsername("user1");
        user1.setPassword("user1user1");
        user1.setEmail("user1@user1.com");
        this.signUpRepository.save(user1);

        SignUp user2 = new SignUp();
        user2.setUsername("user2");
        user2.setPassword("user2user2");
        user2.setEmail("user2@user2.com");
        this.signUpRepository.save(user2);
    }
}
