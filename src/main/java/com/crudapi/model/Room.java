package com.crudapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int members;

    @Column(name = "nome", length = 60)
    private String name;

    @Column
    private String owner;

}
