package com.grupo3.api.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreeting {

    @Override
    public String greeting() {
        return "Estoy saludando desde el grupo 3!";
    }
}
