package com.ifruitcommerce.ifruit.resources;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ifruitcommerce.ifruit.entities.Category;
import com.ifruitcommerce.ifruit.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
     @GetMapping
     public ResponseEntity<Category> findAll(){
         Category cat = new Category();
         return ResponseEntity.ok().body(cat);
     }
}
