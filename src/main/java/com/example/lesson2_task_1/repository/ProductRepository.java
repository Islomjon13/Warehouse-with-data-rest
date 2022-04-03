package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Product;
import com.example.lesson2_task_1.projections.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsByNameAndCategoryId(String name, Long category_id);
}
