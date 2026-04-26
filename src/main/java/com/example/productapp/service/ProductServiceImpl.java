package com.example.productapp.service;
import com.example.productapp.model.Product;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductServiceImpl implements ProductService {
 private final List<Product> products = new ArrayList<>();
 public Product getProductById(Long id){
  return products.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
 }
 public List<Product> getAllProducts(){ return products; }
 public Product saveProduct(Product product){ products.add(product); return product; }
}