package com.example.helloSpring.dao;

import com.example.helloSpring.Modele.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);

}
