package com.assignment.medicineappbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails {
    protected int id;
    protected int orderId;
    protected int productId;

    protected int quantity;

    protected Float price;

    public OrderDetails(){

    }

    public OrderDetails(int id, int orderId, int productId, int quantity, Float price) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

