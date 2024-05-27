package com.example.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class BooksController {

    @GetMapping("/Hello")
    public String hello() {
        return "Hello, World!";
    }
}
