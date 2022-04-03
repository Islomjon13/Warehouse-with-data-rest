package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.AttachmentCollection;
import com.example.lesson2_task_1.entity.Category;
import com.example.lesson2_task_1.entity.Measurement;
import com.example.lesson2_task_1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Long getId();
    String getName();
    Category getCategory();
    AttachmentCollection getAttachmentCollection();
    Integer getCode();
    Measurement getMeasurement();
    boolean isActive();
}
