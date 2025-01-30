package com.tkuzub.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return "Hello World";
    }

}
