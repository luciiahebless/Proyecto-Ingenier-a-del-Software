package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloController")
    public String hello() {
        return "¡Hola mundo desde Lucia 👋🏼!";
    }
}
