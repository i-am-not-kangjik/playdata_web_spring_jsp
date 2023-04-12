package kjkim.kjkimspring.controller;


import kjkim.kjkimspring.sevice.UserService;
import kjkim.kjkimspring.user.UserCreateForm;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        return "signup_form";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {   // Valid 어노테이션을 통해 userCreateForm의
                                                                                                // NotEmpty, Size 등의 검증 기능이 동작하게 설정
        // BindingResult는 @Valid 어노테이션으로 인해 검증이 수행된 결과를 의미하는 객체
        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        if (!userCreateForm.getPassword1().equals(userCreateForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordInCorrect",
                    "2개의 패스워드가 일치하지 않습니다.");
            return "signup_form";
        }

        try {
        userService.create(userCreateForm.getUsername(),
                userCreateForm.getEmail(), userCreateForm.getPassword1());
            // bindingResult(오류코드, 오류메시지)는 특정 필드의 오류가 아닌 일반적인 오류를 등록할때 사용
        } catch(DataIntegrityViolationException e) { // 사용자 ID 또는 이메일 주소가 동일할 경우 발생하는 예외
            e.printStackTrace();
            bindingResult.reject("signupFailed", "이미 가입되어있는 사용자입니다.");
            return "signup_form";
        }
        catch(Exception e){ // 다른 오류일 경우 해당 오류의 메시지를 출력
            e.printStackTrace();
            bindingResult.reject("signupFailed", e.getMessage());

        }
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login_form";
    }
}
