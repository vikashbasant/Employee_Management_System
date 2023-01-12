package com.ems.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
@Data
@Entity
@Table(name = "emp")
public class Empolyee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
