package com.hcl.capstone.service;

import java.util.List;
import com.hcl.capstone.model.Order;
import com.hcl.capstone.model.OrderRepository;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired 
    private ProductService productService;

    public void addProducts(Order order, List<Product> products) {
        order.setProducts(products);
        repository.save(order);
    }

    public void addProduct(Order order, Product product) {
        Product productForOrder = productService.getProductByID(product.getId());
        order.addProduct(productForOrder);
        repository.save(order);
    }

    public void addUserToOrder(Order order, User user) {
        order.setUser(user);
    }

    public void saveOrder(Order order) {
        repository.save(order);
    }
}

