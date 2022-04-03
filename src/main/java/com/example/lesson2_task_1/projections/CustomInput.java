package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Currency;
import com.example.lesson2_task_1.entity.Input;
import com.example.lesson2_task_1.entity.Supplier;
import com.example.lesson2_task_1.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Long getId();
    Timestamp getDate();
    WareHouse getWareHouse();
    Supplier getSupplier();
    Currency getCurrency();
    Integer getFactureNumber();
    Integer getCode();
}
