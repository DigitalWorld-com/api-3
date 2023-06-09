package com.grupo3.api.controllers;

import com.grupo3.api.services.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api3")
@AllArgsConstructor
public class GreetingController {

    GreetingService greetingService;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok(greetingService.greeting());
    }
}