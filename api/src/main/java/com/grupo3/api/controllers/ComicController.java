package com.grupo3.api.controllers;

import com.grupo3.api.services.ComicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api3/comics")
@AllArgsConstructor
public class ComicController {

    ComicService comicService;

    @GetMapping("/listar")
    public ResponseEntity<String> getComics(){
        return ResponseEntity.ok(comicService.getComics());
    }

}
