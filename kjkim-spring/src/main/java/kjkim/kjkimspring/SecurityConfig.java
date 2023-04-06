package kjkim.kjkimspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

@Configuration  // 스프링의 환결설정 파일임을 의미하는 애너테이션
                // 스프링 시큐리티의 설정을 위해 사용
@EnableWebSecurity  // 모든 요청 URL이 스프링 시큐리티의 제어를 받도록 만드는 애너테이션
                    // 내부적으로 SpringSecurityFilterChain이 동작하여 URL 필터가 적용
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().antMatchers("/**").permitAll()
                .and().csrf().ignoringAntMatchers("/h2-console/**")
                .and().headers().addHeaderWriter(new XFrameOptionsHeaderWriter(
                        XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN  // SAMEORIGIN을 설정하면
                                                                                // frame에 포함된 페이지가 페이지를 제공하는 사이트와 동일한 경우 계속 사용할 수 있다.
                ));
        return http.build();
    }
}
