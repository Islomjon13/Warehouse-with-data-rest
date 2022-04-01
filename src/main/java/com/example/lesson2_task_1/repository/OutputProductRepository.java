package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct")
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}
