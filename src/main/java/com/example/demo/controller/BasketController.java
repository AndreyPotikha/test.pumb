package com.example.demo.controller;

import com.example.demo.model.Basket;
import com.example.demo.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketService basketService;

    @PostMapping(value = "/save")
    public ResponseEntity<Basket> save(@RequestBody Basket basket) {
        Basket saveBasket = basketService.save(basket);
        return new ResponseEntity<>(saveBasket, HttpStatus.CREATED);
    }

    @PostMapping(value = "/get_all")
    public ResponseEntity<List<Basket>> getAll() {
        List<Basket> allBasket = basketService.getAll();
        return new ResponseEntity<>(allBasket, HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Basket> update(@RequestBody Basket basket) {
        Basket updateBasket = basketService.update(basket);
        return new ResponseEntity<>(updateBasket, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        basketService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
