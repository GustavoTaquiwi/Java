package com.ifruitcommerce.ifruit.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private  String description;
    private Double price;
    private  String imgIrl;

    public Product() {

    }

    public Product(Long id, String name, String description, Double price, String imgIrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgIrl = imgIrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgIrl() {
        return imgIrl;
    }

    public void setImgIrl(String imgIrl) {
        this.imgIrl = imgIrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
