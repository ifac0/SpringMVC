package com.ifac0.workshop_jpa_hibernate.repositories;

import com.ifac0.workshop_jpa_hibernate.entities.Category;
import com.ifac0.workshop_jpa_hibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
