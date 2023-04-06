package kjkim.kjkimspring.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 20) // 문자 길이를 제한
    @NotEmpty(message = "사용자 ID는 필수항목!") // Null 또는 빈 문자열을 허용핮 ㅣ않음
    private String username;

    @NotEmpty(message = "비밀번호는 필수항목!")
    private String password1;

    @NotEmpty(message = "비밀번호 재확인은 필수항목!")
    private String password2;

    @Email  // 해당 속성의 값이 이메일형식과 일치하는지를 검증
    @NotEmpty(message = "이메일은 필수항목!")
    private String email;
}
