package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Output;
import com.example.lesson2_task_1.projections.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Long> {
}
