package com.example.demostudygit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

@SpringBootApplication
public class DemoStudyGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStudyGitApplication.class, args);
    }

    @RestController
    @RequestMapping("/test")
    class TestController {
        public ResponseEntity sayHello() {
            return ResponseEntity.ok("");
        }
    }
}
