package kjkim.kjkimspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("name", "김강직");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name_value, Model model){
        model.addAttribute("name", name_value);
        return "hello-template";
    }

    // 인자 값 2개를 받는 메소드를 작성하고, View로 렌더링 (name - 문자열, age - 정수)
    @GetMapping("hello-mvc2")
    public String helloMvc2(@RequestParam("name") String name_value, @RequestParam("age") Integer age_value, Model model){
        model.addAttribute("name", name_value);
        model.addAttribute("age", age_value);
        return "hello-template2";
    }
    @GetMapping("form-test")
    public String formTest(){
        return "form-test";
    }
//    @GetMapping("form-test-get")
    @PostMapping("form-test-get")
    public String formTestGet(@RequestParam("username") String username_value,
                              @RequestParam("password") String password_value, Model model){
        model.addAttribute("username", username_value);
        model.addAttribute("password", password_value);
        return "hello-template3";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public  String helloString(@RequestParam("name") String name){
        return "hello " + name; // http://localhost:9090/hello-string?name=testmessage
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) { // http://localhost:9090/hello-api?name=testmessage
        Hello hello = new Hello(); // Hello 클래스의 인스턴스인 hello 객체 생성
        hello.setName(name); // 객체에 setName() 메소드를 호출하여 입력 받은 파라미터 값을 객체 변수인 name에 저장
        return hello;
    }

    static class Hello { // 클래스 생성
        private String name; // 객체 인수(인스턴스 변수, 멤버 변수, 속성)

        public String getName() {
            return name;
        }

        public void setName(String name) { // 입력 : String name, 출력 : void(없음)
            this.name = name;
        }
    }
}
