package com.ifac0.workshop_jpa_hibernate.repositories;

import com.ifac0.workshop_jpa_hibernate.entities.Category;
import com.ifac0.workshop_jpa_hibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
