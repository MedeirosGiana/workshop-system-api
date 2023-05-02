package com.workshop.workshop.system.services;

import com.workshop.workshop.system.entities.Order;
import com.workshop.workshop.system.entities.User;
import com.workshop.workshop.system.repositories.OrderRepository;
import com.workshop.workshop.system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){

        return  repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
