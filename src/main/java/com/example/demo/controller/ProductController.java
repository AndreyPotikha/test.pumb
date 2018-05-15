package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product saveProduct = productService.save(product);
        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
    }

    @PostMapping(value = "/get_all")
    public ResponseEntity<List<Product>> getAll() {
        List<Product> allProducts = productService.getAll();
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        Product updateProduct = productService.update(product);
        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
