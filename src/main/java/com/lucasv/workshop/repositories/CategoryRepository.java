package com.lucasv.workshop.repositories;

import com.lucasv.workshop.entities.Category;
import com.lucasv.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
