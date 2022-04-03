package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Long getId();
    String getName();
    boolean isActive();
}
