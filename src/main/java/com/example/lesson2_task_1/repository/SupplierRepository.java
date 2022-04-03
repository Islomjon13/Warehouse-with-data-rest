package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Supplier;
import com.example.lesson2_task_1.projections.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "Supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
}
