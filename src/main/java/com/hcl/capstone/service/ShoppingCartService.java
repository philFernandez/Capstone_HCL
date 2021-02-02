package com.hcl.capstone.service;

import java.util.ArrayList;
import java.util.List;
import com.hcl.capstone.model.Order;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ShoppingCartService {

    @Autowired
    private ProductService productService;

    private User user;
    private Order order;
    private List<Product> orderedProducts;
    private Product product;


    public ShoppingCartService(User user, Order order, List<Product> orderedProducts) {
        this.user = user;
        this.order = order;
        this.orderedProducts = new ArrayList<>();
        this.orderedProducts.addAll(orderedProducts);
        order.setUser(user);
        user.addOrder(order);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> allProducts() {
        return productService.getProductStock();
    }
}
