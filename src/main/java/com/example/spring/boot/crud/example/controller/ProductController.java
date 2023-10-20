package com.example.spring.boot.crud.example.controller;

import com.example.spring.boot.crud.example.entity.Product;
import com.example.spring.boot.crud.example.service.ProductService;

import com.example.spring.boot.crud.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@ComponentScan
@RestController
@RequestMapping("/api/V1")
public class ProductController {
    @Autowired
    private ProductService service;
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> findAllProducts(){
    return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
    return service.getProductById(id);

    }
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
    return service.getProductByName(name);
    }
    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody Product product){
    return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
    return service.deleteProductById(id);
    }
}
