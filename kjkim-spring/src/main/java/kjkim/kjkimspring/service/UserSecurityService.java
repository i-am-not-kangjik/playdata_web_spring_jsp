package kjkim.kjkimspring.service;

import kjkim.kjkimspring.user.SignUp;
import kjkim.kjkimspring.user.SignUpRepository;
import kjkim.kjkimspring.user.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService {
    // 스프링 시큐리티가 제공하는 UserDetailsService 인터페이스를 구현
    // UserDetailsService는 loadUserByUsername의 메소드를 구현하도록 강제하는 인터페이스
    // loadUserByUsername 메소드는 사용자명으로 비밀번호를 조회하여 반환하는 메소드
    private final SignUpRepository signUpRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 사용자명으로 SignUp 객체를 조회하고 만약 사용자명에 해당하는 데이터가 없을 경우에는 UsernameNotFoundException 에러 발생
        Optional<SignUp> _signup = this.signUpRepository.findByUsername(username);
        if (_signup.isEmpty()) {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
        SignUp signUp = _signup.get();
        List<GrantedAuthority> authorities = new ArrayList<>();
        // GrantedAuthority : UserDetailsService와 같이 사용할 수 있는 스프링 시큐리티의 인터페이스로 계정에 설정되어 있는 권한 목록을 반환
        // 사용자명이 admin인 경우 ADMIN 권한을 부여하고 그 외의 경우에는 USER 권한 부여
        if ("admin".equals(username)) {
            authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
        } else {
            authorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
        }
        // 사용자명, 비밀번호, 권한을 입력으로 스프링 시큐리티의 User 객체를 생성하여 반환
        return new User(signUp.getUsername(), signUp.getPassword(), authorities);

        // 스프링 시큐리티는 loadUserbyUsername 메소드에 의해 반환된 User 객체의
        // 비밀번호가 화면으로부터 입력받은 비밀번호와 일치하는지를 검사하는 로직을 내부적으로 실행
    }
}
