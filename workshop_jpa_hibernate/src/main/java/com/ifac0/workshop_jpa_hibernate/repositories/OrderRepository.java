package com.ifac0.workshop_jpa_hibernate.repositories;

import com.ifac0.workshop_jpa_hibernate.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
