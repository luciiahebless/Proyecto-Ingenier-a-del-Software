package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SabrinaController {

    @GetMapping("/sabrina")
    public String hola() {
        return "¡Hello world! - Sabrina";
    }
}
