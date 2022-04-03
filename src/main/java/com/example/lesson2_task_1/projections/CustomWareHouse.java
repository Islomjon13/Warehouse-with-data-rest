package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {
    Long getId();
    String getName();
    boolean isActive();
}
