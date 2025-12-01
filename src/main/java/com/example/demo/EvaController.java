package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaController {

    @GetMapping("/eva")
    public String helloEva() {
        return "¡Hello world desde Eva!";
    }
}
