package com.workshop.workshop.system.repositories;

import com.workshop.workshop.system.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
