package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.WareHouse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "wareHouse")
public interface WareHouseRepository extends JpaRepository<WareHouse,Long> {
    boolean existsByName(String name);
    @RestResource(path = "byName")
    List<WareHouse> findAllByNameStartsWith(@Param("name") String name, Pageable pageable);
}
