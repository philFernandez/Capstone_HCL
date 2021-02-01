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
    private Category category;
    private Genre genre;
    private String description;
    private double price;
    private int quantity;

    public Product(Long productId, String name, Category category,
            String description, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(Long productId, String name, Category category, Genre genre, 
            String description, double price, int quantity) {
        this(productId, name, category, description, price, quantity);
        this.genre = genre;
    }

}
