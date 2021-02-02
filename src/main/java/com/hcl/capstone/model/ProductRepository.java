package com.hcl.capstone.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getByProductId(Long id);

    @Query("SELECT p FROM Product p WHERE CONCAT(p.name, ' ', p.category, ' ', p.genre, ' ', p.description, ' ', p.price) LIKE %?1%")
    public List<Product> search(String keyword);
}
