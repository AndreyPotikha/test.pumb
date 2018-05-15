package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;

public interface ClientService {

    Client save(Client client);

    List<Client> getAll();

    Client update(Client client);

    void delete(Long id);
}
