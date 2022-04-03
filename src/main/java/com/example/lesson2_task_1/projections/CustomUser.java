package com.example.lesson2_task_1.projections;

import com.example.lesson2_task_1.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Long getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    Integer getCode();
    String getPassword();
    boolean isActive();
}
