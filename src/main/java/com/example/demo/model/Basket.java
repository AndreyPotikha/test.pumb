package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "basket")
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToMany
    @JoinColumn(name = "product_id")
    private List<Product> product;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
