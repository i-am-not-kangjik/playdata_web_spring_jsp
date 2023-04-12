package kjkim.kjkimspring.user;

import lombok.Getter;

@Getter //상수 자료형이므로 Setter는 없이 Getter만
public enum UserRole {  // UserRole은 열거 자료형(enum)으로 작성
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
