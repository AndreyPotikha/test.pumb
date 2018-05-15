package com.example.demo.service.impl;

import com.example.demo.model.Basket;
import com.example.demo.repository.BasketRepository;
import com.example.demo.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Override
    public Basket save(Basket basket) {
        return basketRepository.save(basket);
    }

    @Override
    public List<Basket> getAll() {
        return basketRepository.findAll();
    }

    @Override
    public Basket update(Basket basket) {
        return basketRepository.saveAndFlush(basket);
    }

    @Override
    public void delete(Long id) {
        basketRepository.delete(id);
    }
}
