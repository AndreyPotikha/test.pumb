package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/save")
    public ResponseEntity<Client> save(@RequestBody Client client) {
        Client saveClient = clientService.save(client);
        return new ResponseEntity<>(saveClient, HttpStatus.CREATED);
    }

    @PostMapping(value = "/get_all")
    public ResponseEntity<List<Client>> getAll() {
        List<Client> allClient = clientService.getAll();
        return new ResponseEntity<>(allClient, HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Client> update(@RequestBody Client client) {
        Client updateClient = clientService.update(client);
        return new ResponseEntity<>(updateClient, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        clientService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
