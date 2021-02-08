package com.example.helloSpring.dao;

import com.example.helloSpring.Modele.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDaoImp implements ProductDao{


    public static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"pc ",200));
        products.add(new Product(2,"telephone ",500));
        products.add(new Product(3,"casque ",100));
    }




    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
