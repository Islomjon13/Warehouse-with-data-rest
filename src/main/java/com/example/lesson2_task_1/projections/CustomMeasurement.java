package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Long getId();
    String getName();
    boolean isActive();
}
