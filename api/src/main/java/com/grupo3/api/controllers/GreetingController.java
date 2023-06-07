package com.grupo3.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-3")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Estoy saludando desde el grupo 3!";
    }

}