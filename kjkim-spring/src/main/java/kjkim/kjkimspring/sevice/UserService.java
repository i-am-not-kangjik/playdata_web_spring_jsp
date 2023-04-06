package kjkim.kjkimspring.sevice;

import kjkim.kjkimspring.user.SignUp;
import kjkim.kjkimspring.user.SignUpRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final SignUpRepository signupRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(SignUpRepository signupRepository, PasswordEncoder passwordEncoder){
        this.signupRepository = signupRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public SignUp create(String username, String email, String password){
        SignUp user = new SignUp();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        this.signupRepository.save(user);
        return user;
    }
}
