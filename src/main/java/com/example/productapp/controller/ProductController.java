package com.example.productapp.controller;
import com.example.productapp.model.Product;
import com.example.productapp.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
 private final ProductService productService;
 public ProductController(ProductService productService){this.productService=productService;}
 @GetMapping public List<Product> getAll(){ return productService.getAllProducts(); }
 @GetMapping("/{id}") public Product getById(@PathVariable Long id){ return productService.getProductById(id); }
 @PostMapping public Product save(@RequestBody Product product){ return productService.saveProduct(product); }
}