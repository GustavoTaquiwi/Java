package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.OrdemItem;
import com.ifruitcommerce.ifruit.entities.User;
import com.ifruitcommerce.ifruit.repositories.OrdemItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ordemitem")
public class OrdemItemResource {
    @GetMapping
    public ResponseEntity<OrdemItem> findAll(){
        OrdemItem repo = new OrdemItem();
        return ResponseEntity.ok().body(repo);
    }
}
