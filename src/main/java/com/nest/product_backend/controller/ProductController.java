package com.nest.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ProductController {
    @GetMapping("/")
    public String HomePage(){
        return "Welcome Home Page!";
    }
}
