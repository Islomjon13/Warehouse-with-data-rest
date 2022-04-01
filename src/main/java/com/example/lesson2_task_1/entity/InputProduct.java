package com.example.lesson2_task_1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Timestamp expireDate;

    @ManyToOne
    private Input input;
}
