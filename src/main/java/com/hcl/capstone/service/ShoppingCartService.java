package com.hcl.capstone.service;

import java.security.Principal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.hcl.capstone.model.Order;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.User;
import com.hcl.capstone.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ShoppingCartService {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    private User user;
    private Order order;
    private List<Product> orderedProducts;
    private Product product;
    private Principal principal;


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

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public List<Product> allProducts() {
        return productService.getProductStock();
    }


    public void linkUserToCart(Principal principal) throws ParseException {
        // get logged in user from database
        if (user == null) {
            user = userService.getUserByName(principal.getName());
        }

        if (order == null) {
            order = new Order(MyUtils.DATE_FMT.parse("02/01/2021"), 0.07, user);
            order.setUser(user);
            user.addOrder(order);
            userService.saveUser(user);
            orderService.saveOrder(order);
        }
    }

    public void addToOrder(Product product) {
        orderService.addProduct(this.order, product);
    }

    public List<Product> getShoppingCart() {
        return productService.getOrderedProducts(order.getId());
    }

}
