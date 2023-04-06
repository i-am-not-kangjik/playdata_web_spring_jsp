package kjkim.kjkimspring.user;

import javax.persistence.*;
// create table (id int, auto_increment primary key, username varchar(50), ...)
// 아래의 Entity 어노테이션을 지정해서 클래스가 DB인 것처럼 수행
// Getter -> DB의 값을 가져오는데 활용
// Setter -> DB에 값을 저장하는데 활용
@Entity // 해당 클래스를 JPA가 인식할 수 있도록 설정, Controller로 사용될 클래스에 @Controller 에너테이션을 적용한 것과 동일한 원리
public class SignUp {
    @Id // id 속성을 기본 키로 지정. 엔티티에서 각 데이터를 구분하는 유효한 값으로 중복되면 안되기 때문
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터를 저장할 때 해당 속성에 값을 따로 세팅하지 않아도 1씩 자동으로 증가하여 저장,
                                                        // strategy는 고유번호를 생성하는 옵션
                                                        // GenerationType.IDENTITY는 해당 컬럼만의 독립적인 시퀀스를 생성하여 번호를 증가시킬 때 사용
    private  Long id;

    @Column(unique = true) // 컬럼의 세부 설정에 사용
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
