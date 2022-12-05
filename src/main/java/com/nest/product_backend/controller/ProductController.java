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

    @PostMapping("add")
    public String AddProduct(){ return "Welcome to Add Product page!"; }

    @PostMapping("search")
    public String SearchProduct(){ return "Welcome to Search Product page!"; }

    @PostMapping("edit")
    public String EditProduct(){ return "Welcome to Edit Product page!"; }

    @GetMapping("viewAll")
    public String ViewAllProduct(){ return "Welcome to View All Product page!"; }

    @PostMapping("delete")
    public String DeleteProduct(){ return "Welcome to Delete Product page!"; }
}
