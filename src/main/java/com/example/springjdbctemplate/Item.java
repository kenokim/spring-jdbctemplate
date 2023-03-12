package com.example.springjdbctemplate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
}
