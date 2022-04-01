package com.example.lesson2_task_1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    //generate not repeated code for product
    private static Integer generateCode = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne
    private AttachmentCollection attachmentCollection;

    @Column(unique = true)
    private Integer code = generateCode++;

    @OneToOne
    private Measurement measurement;

    private boolean active = true;
}
