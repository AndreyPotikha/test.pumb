package com.example.demo.service;

import com.example.demo.model.Basket;

import java.util.List;

public interface BasketService {

    Basket save(Basket basket);

    List<Basket> getAll();

    Basket update(Basket basket);

    void delete(Long id);

}
