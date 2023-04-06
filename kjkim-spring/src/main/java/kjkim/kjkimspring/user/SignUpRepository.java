package kjkim.kjkimspring.user;

// 엔티티에 의해 생성된 데이터베이스 테이블에 접근하는 메서드들(findAll, save 등)을 사용하기 위한 인터페이스
// 데이터 처리를 위해서는 테이블에 어떤 값을 넣거나 값을 조회하는 CRUD(Create, Read, Update, Delete)가 필요
// 즉, CRUD를 어떻게 처리할지 정의하는 계층

// Jpa Repository 인터페이스 상속
// 제너릭스 타입으로 <SignUp, Long>으로 엔티티 타입(SignUp)과 해당 엔티티의 PK(기본키) 속성 타입을 지정
// JpaRepository 생성에 사용되는 규칙(이전에 SignUp 클래스의 id를 Long 타입으로 지정했었음)
import org.springframework.data.jpa.repository.JpaRepository;
public interface SignUpRepository extends JpaRepository<SignUp, Long>{
    
}
