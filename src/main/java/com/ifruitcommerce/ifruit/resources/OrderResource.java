package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
    @GetMapping
    public ResponseEntity<Order> findAll() {
        Order order = new Order();
        return ResponseEntity.ok().body(order);
    }
}
