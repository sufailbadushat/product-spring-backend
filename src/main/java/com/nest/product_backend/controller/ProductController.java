package com.nest.product_backend.controller;

import com.nest.product_backend.dao.ProductDao;
import com.nest.product_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ProductController {


    @Autowired
    ProductDao productDao;



    @GetMapping("/")
    public String HomePage(){
        return "Welcome Home Page!";
    }

    @PostMapping(path = "/add", produces = "application/json", consumes = "application/json")
    public String AddProduct(@RequestBody Product p){
        System.out.println(p.getProductName().toString());

        productDao.save(p);
        return "Product added successfully";
    }

    @PostMapping("search")
    public String SearchProduct(){ return "Welcome to Search Product page!"; }

    @PostMapping("edit")
    public String EditProduct(){ return "Welcome to Edit Product page!"; }

    @GetMapping("viewAll")
    public String ViewAllProduct(){ return "Welcome to View All Product page!"; }

    @PostMapping("delete")
    public String DeleteProduct(){ return "Welcome to Delete Product page!"; }
}
