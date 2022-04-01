package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsByName(String name);
}
