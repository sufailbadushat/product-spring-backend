package com.nest.product_backend.controller;

import com.nest.product_backend.dao.ProductDao;
import com.nest.product_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class ProductController {


    @Autowired
    ProductDao productDao;



    @GetMapping("/")
    public String HomePage(){
        return "Welcome Home Page!";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", produces = "application/json", consumes = "application/json")
    public String AddProduct(@RequestBody Product p){
        System.out.println(p.getProductName().toString());

        productDao.save(p);
        return "Product added successfully";
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Product> ViewAllProduct()
    {
        return (List<Product>) productDao.findAll();
    }

    @PostMapping("edit")
    public String EditProduct(){ return "Welcome to Edit Product page!"; }

    @PostMapping("search")
    public String SearchProduct(){ return "Welcome to Search Product page!"; }

    @PostMapping("delete")
    public String DeleteProduct(){ return "Welcome to Delete Product page!"; }
}
