package com.pragma.domain.service;

import com.pragma.domain.model.Product;
import com.pragma.infrastructure.adapter.ProductRepository;
import jakarta.transaction.Transactional;
import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product registerProduct(Product product) {
        // Implementar la lógica para registrar un producto
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        // Implementar la lógica para obtener todos los productos
        return productRepository.findAll();
    }

    public Product updateProduct(Long id, Product product) {
        // Implementar la lógica para actualizar un producto
        return productRepository.update(id, product);
    }

    public void deleteProduct(Long id) {
        // Implementar la lógica para eliminar un producto
        productRepository.deleteById(id);
    }
}