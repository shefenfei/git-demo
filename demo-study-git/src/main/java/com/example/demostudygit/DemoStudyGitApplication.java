package com.example.demostudygit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoStudyGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStudyGitApplication.class, args);
    }

    @RestController
    @RequestMapping("/test")
    class TestController {
        public ResponseEntity sayHello() {
            String patternReg = "\\d+";
            Pattern compile = Pattern.compile(patternReg);
            Matcher matcher = compile.matcher("");
            while (matcher.find()) {
                String group = matcher.group(0);

            }
            return ResponseEntity.ok("");
        }
    }
}
