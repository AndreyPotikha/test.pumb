package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    Product save(Product basket);

    List<Product> getAll();

    Product update(Product product);

    void delete(Long id);
}
