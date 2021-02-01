package com.hcl.capstone.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "MERCH_ORDER")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_NUMBER")
    private Long id;
    private Date orderDate;
    private double taxRate;
    // sutotal = sum of product prices
    // total = subtotal * taxRate + subtotal

    @OneToMany
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ORDER_NUMBER")
    private List<Product> products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Order(Date orderDate, double taxRate,
            User user) {
        this.orderDate = orderDate;
        this.taxRate = taxRate;
        this.user = user;
    }

}
