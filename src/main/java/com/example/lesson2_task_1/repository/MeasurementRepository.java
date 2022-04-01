package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement")
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    boolean existsByName(String name);
}
