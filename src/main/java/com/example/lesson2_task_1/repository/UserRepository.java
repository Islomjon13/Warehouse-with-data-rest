package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.validation.constraints.Size;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByFirstNameAndLastNameOrPhoneNumber(String firstName, String lastName, @Size(min = 9, max = 13) String phoneNumber);
}
