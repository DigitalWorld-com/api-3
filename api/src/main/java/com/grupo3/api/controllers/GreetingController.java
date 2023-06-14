package com.grupo3.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api3")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Estoy saludando desde el grupo 3!";
    }
}