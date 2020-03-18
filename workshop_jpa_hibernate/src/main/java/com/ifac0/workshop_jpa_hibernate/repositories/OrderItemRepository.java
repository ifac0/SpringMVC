package com.ifac0.workshop_jpa_hibernate.repositories;

import com.ifac0.workshop_jpa_hibernate.entities.Order;
import com.ifac0.workshop_jpa_hibernate.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
