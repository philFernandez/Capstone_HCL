package com.hcl.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// one Order -> many Products
// Relationship is unidirectional with Order. An Order must contain products,
// but products can be displayed independant of any order

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "PRODUCT_ID") // foreign key for one{order} -> many{product}
    private Long productId;
    private String name;
    private String category;
    private String genre;
    private String description;
    private double price;

    public Product(Long productId, String name, String category, String genre,
            String description, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.genre = genre;
        this.description = description;
        this.price = price;
    }

}
