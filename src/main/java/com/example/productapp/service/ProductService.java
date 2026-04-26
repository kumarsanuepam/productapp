package com.example.productapp.service;
import com.example.productapp.model.Product;
import java.util.List;
public interface ProductService {
 Product getProductById(Long id);
 List<Product> getAllProducts();
 Product saveProduct(Product product);
}