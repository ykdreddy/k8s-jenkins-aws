package com.joshu.Joshuk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoshuDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - World(Spring Boot app)!";
    }
}
