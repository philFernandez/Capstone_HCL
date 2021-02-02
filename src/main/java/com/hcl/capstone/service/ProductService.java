package com.hcl.capstone.service;

import java.util.List;
import java.util.stream.Collectors;
import com.hcl.capstone.model.Category;
import com.hcl.capstone.model.Product;
import com.hcl.capstone.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    // Only return products that are in stock and not 
    // part of a User's order history. productId is the
    // foreign key which associates a product instance 
    // with a particular order. If productId is null
    // we know the product is not in a User's order history
    public List<Product> getProductStock() {
        // Notice the dope A.F. Java 8 chops here 😉
        return repository.findAll()
                .stream()
                .filter(product -> product.getProductId() == null)
                .collect(Collectors.toList());
    }

    public List<Product> getInstruments() {
        List<Product> products = getProductStock();
        return products
                .stream()
                .filter(product -> product.getCategory() == Category.INSTRUMENT)
                .collect(Collectors.toList());
    }
}
