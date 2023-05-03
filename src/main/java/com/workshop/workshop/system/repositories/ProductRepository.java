package com.workshop.workshop.system.repositories;


import com.workshop.workshop.system.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
