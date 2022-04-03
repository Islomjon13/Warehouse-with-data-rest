package com.example.lesson2_task_1.repository;

import com.example.lesson2_task_1.entity.WareHouse;
import com.example.lesson2_task_1.projections.CustomUser;
import com.example.lesson2_task_1.projections.CustomWareHouse;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "wareHouse",excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Long> {

}
