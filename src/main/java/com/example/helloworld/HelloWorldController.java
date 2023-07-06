package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }

    @RequestMapping("/bye")
    String byebye() {
        return "Bye bye, Spring Boot!";
    }
}
