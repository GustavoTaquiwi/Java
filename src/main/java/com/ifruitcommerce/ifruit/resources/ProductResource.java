package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {
    @GetMapping
    public ResponseEntity<Product> findAll() {
        Product product = new Product();
        return ResponseEntity.ok().body(product);
    }
}
