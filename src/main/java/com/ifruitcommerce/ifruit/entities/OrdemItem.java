package com.ifruitcommerce.ifruit.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

@Entity
@Table (name = "tb_ordemitem")
public class OrdemItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private Double price;

    public OrdemItem() {

    }



    public OrdemItem(Long Id, int quantity, Double price) {

        this.quantity = quantity;
        this.price = price;
        this.id = Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdemItem ordemItem = (OrdemItem) o;
        return Objects.equals(id, ordemItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
