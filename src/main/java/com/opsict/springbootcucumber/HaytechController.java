package com.opsict.springbootcucumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaytechController {

    @GetMapping("/hello")
    public String sayHello() {
        return "get-hello1";
    }

    @PostMapping("/haytech")
    public String sayHelloPost() {
        return "post-hello1";
    }
}