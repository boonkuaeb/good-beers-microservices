package com.example.beercatalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Beer {

    public Beer(){}
    public Beer(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}




