package com.workshop.workshop.system.services;

import com.workshop.workshop.system.entities.Category;
import com.workshop.workshop.system.entities.Product;
import com.workshop.workshop.system.repositories.CategoryRepository;
import com.workshop.workshop.system.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return  repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
