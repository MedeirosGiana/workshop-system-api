package com.workshop.workshop.system.repositories;

import com.workshop.workshop.system.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
