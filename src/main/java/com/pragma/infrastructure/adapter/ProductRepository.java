package com.pragma.infrastructure.adapter;

import com.pragma.domain.model.Product;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository {

    Product save(Product product);
    List<Product> findAll();
    Product update(Long id, Product product);
    void deleteById(Long id);
}