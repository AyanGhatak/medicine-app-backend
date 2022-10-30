package com.assignment.medicineappbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "OrderInfo")
public class OrderInfo {
    private int id;
    private int userId;
    private Long orderAt;
    private String address;

    public OrderInfo() {
    }

    public OrderInfo(int id, int userId, Long orderAt, String address) {
        this.id = id;
        this.userId = userId;
        this.orderAt = orderAt;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Long getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Long orderAt) {
        this.orderAt = orderAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
