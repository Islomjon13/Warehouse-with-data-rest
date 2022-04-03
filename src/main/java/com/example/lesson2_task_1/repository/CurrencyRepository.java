package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Currency;
import com.example.lesson2_task_1.projections.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    boolean existsByName(String name);
}
