package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Long getId();
    Timestamp getDate();
    WareHouse getWareHouse();
    Currency getCurrency();
    Integer getFactureNumber();
    Integer getCode();
    Client getClient();
}
