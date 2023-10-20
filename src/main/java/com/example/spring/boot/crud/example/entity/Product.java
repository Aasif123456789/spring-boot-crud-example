package com.example.spring.boot.crud.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private int quantity;
    private double price;


}
