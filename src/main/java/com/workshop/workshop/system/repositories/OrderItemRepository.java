package com.workshop.workshop.system.repositories;

import com.workshop.workshop.system.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
