package com.ifruitcommerce.ifruit.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;
@Entity
@Table (name = "tb_payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date moment;

    public Payment() {

    }

    public Payment(Date moment, Long id) {
        this.moment = moment;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
