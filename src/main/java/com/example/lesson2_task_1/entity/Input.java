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
public class Input {
    //generate not repeated code for product
    private static Integer generateCode = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Timestamp date;

    @OneToOne
    private WareHouse wareHouse;

    @OneToOne
    private Supplier supplier;

    @OneToOne
    private Currency currency;

    private Integer factureNumber;

    @Column(unique = true)
    private Integer code = generateCode++;

}
