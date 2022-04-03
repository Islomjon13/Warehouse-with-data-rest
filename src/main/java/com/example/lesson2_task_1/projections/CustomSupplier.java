package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Long getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
