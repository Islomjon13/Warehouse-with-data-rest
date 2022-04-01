package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output")
public interface OutputRepository extends JpaRepository<Output,Long> {
}
