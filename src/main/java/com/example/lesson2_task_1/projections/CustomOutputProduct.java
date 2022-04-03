package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.Output;
import com.example.lesson2_task_1.entity.OutputProduct;
import com.example.lesson2_task_1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    double getAmount();
    double getPrice();
    boolean isActive();
    Output getOutput();
}
