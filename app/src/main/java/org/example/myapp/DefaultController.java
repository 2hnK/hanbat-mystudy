package org.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler의 리턴 값은 Thymeleaf가 실행할 view(템플릿 파일) 이름이다.
public class DefaultController {

    private final DefaultService defaultService;

    @Autowired
    public DefaultController(DefaultService defaultService) {
        this.defaultService = defaultService;
    }

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/help") // "/help" URL 요청을 help.html 템플릿으로 매핑
    public String help() {
        return "help"; // templates/help.html 파일을 렌더링
    }

    @GetMapping("/question")
    public String questionPage() {
        return "question";
    }
}