package com.assignment.medicineappbackend.model;

import java.util.ArrayList;

public class Order {

    private ArrayList<OrderDetails> details;
    private OrderInfo info;


    public Order() {
    }

    public Order(OrderInfo info, ArrayList details) {
        this.info = info;
        this.details = details;
    }

    public OrderInfo getInfo() {
        return info;
    }

    public void setInfo(OrderInfo info) {
        this.info = info;
    }

    public ArrayList<OrderDetails> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<OrderDetails> details) {
        this.details = details;
    }
}
