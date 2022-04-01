package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client, Long> {
    boolean existsByPhoneNumber(String phoneNumber);
}
