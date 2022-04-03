package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Input;
import com.example.lesson2_task_1.entity.InputProduct;
import com.example.lesson2_task_1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Long getId();
    Product getProduct();
    double getAmount();
    double getPrice();
    Timestamp getExpireDate();
    Input getInput();
}
