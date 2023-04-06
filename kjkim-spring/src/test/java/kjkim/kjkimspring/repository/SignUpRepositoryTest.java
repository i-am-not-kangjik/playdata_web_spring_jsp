package kjkim.kjkimspring.repository;

// 개발한 기능을 테스트할 때 자바의 main 메소드를 통해 실행하거나,
// 웹 애플리케이션의 컨트롤러를 통해서 해당 기능을 실행하는 방법은 비효율(준비 및 실행, 반복 실행과 테스트가 어려움)
// JUnit이라는 프레임워크로 테스트를 실행

import kjkim.kjkimspring.user.SignUp;
import kjkim.kjkimspring.user.SignUpRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

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

    @Test
    void testJpa_2() {
        List<SignUp> all = this.signUpRepository.findAll(); // 모든 데이터를 조회하기 위해서 레포지터리의 findAll 메서드를 사용(데이터 조회)
        Assertions.assertEquals(2, all.size()); // 2건의 데이터를 저장했기 때문에 데이터 사이즈가 2인지 화인

        SignUp user = all.get(0);
        Assertions.assertEquals("user1", user.getUsername());; // (기대값, 실제값)이 동일하지 않다면 테스트를 실패로 처리
//        Assertions.assertEquals("에러가 발생할까요?", user.getUsername());
    }

    @Test
    void testJpa_3() {
        Optional<SignUp> up = this.signUpRepository.findById(1L);   // id 값으로 데이터를 조회하기 위해 findById 메서드를 사용
                                                                    // Optional은 null 처리를 유연하게 처리하기 위해 사용하는 클래스
                                                                    // isPresent로 null이 아닌지를 확인 후 get으로 실제 SignUp의 객체 값을 얻어옴
        if(up.isPresent()) {
            SignUp user = up.get();
            Assertions.assertEquals("user1", user.getUsername());
        }
    }

    @Test
    void testJpa_4() {
        SignUp user = this.signUpRepository.findByUsername("user1");    // SignUp 엔티티의 username 값으로 데이터를 조회
        Assertions.assertEquals(1, user.getId());               // findByUsername과 같은 메소드를 기본적으로 제공하지 않아 인터페이스 수정 필요
    }

    @Test
    void testJpa_5() {
        SignUp user = this.signUpRepository.findByUsernameAndEmail(
                "user1", "user1@user1.com"
        );
        Assertions.assertEquals(1, user.getId());;
    }

    @Test
    void testJpa_6() {
        List<SignUp> userlist = this.signUpRepository.findByEmailLike("%com");
        SignUp user = userlist.get(1);
        Assertions.assertEquals("user2@user2.com", user.getEmail());;
    }

    @Test
    void testJpa_7() {
        Optional<SignUp> user = this.signUpRepository.findById(2L);
        Assertions.assertTrue(user.isPresent());
        SignUp u = user.get();
        u.setEmail("user2@naver.com");
        this.signUpRepository.save(u);
    }
}
