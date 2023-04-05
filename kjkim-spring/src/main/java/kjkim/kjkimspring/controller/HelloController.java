package kjkim.kjkimspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}
