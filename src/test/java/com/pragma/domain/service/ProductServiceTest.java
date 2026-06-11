package com.pragma.domain.service;

import com.pragma.domain.model.Product;
import com.pragma.infrastructure.adapter.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRegisterProduct() {
        Product product = new Product(1L, "Producto 1", new BigDecimal("10.00"), 10, "Categoría 1");
        when(productRepository.save(product)).thenReturn(product);
        Product registeredProduct = productService.registerProduct(product);
        assertNotNull(registeredProduct);
        assertEquals(product, registeredProduct);
    }

    @Test
    void testGetAllProducts() {
        Product product1 = new Product(1L, "Producto 1", new BigDecimal("10.00"), 10, "Categoría 1");
        Product product2 = new Product(2L, "Producto 2", new BigDecimal("20.00"), 20, "Categoría 2");
        when(productRepository.findAll()).thenReturn(List.of(product1, product2));
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
        assertEquals(2, products.size());
    }

    @Test
    void testUpdateProduct() {
        Product product = new Product(1L, "Producto 1", new BigDecimal("10.00"), 10, "Categoría 1");
        when(productRepository.update(1L, product)).thenReturn(product);
        Product updatedProduct = productService.updateProduct(1L, product);
        assertNotNull(updatedProduct);
        assertEquals(product, updatedProduct);
    }

    @Test
    void testDeleteProduct() {
        doNothing().when(productRepository).deleteById(1L);
        productService.deleteProduct(1L);
        verify(productRepository, times(1)).deleteById(1L);
    }
}