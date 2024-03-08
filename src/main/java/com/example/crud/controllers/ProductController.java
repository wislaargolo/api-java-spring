package com.example.crud.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("deu ok");
    }
}
