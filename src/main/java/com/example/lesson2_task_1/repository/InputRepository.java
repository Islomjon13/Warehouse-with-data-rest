package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input")
public interface InputRepository extends JpaRepository<Input,Long> {
}
