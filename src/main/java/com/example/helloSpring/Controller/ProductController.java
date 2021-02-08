package com.example.helloSpring.Controller;

import com.example.helloSpring.Modele.Product;
import com.example.helloSpring.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping(value = "Produits")
    public List<Product> getAllProducts(){
        return productDao.findAll();
    }


    //Produit/{id}
    @GetMapping(value = "Produits/{id}")
    public Product affProductProduct(@PathVariable int id ){
        Product product = new Product(id,new String("aspirateur"),100);
        return product;
    }

}
