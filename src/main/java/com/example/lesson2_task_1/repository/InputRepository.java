package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Input;
import com.example.lesson2_task_1.projections.CustomInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Long> {
}
