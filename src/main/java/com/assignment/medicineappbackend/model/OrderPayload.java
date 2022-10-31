package com.assignment.medicineappbackend.model;

import java.util.List;

public class OrderPayload {
    private List<OrderDetails> details;
    private OrderInfo info;


    public OrderPayload() {
    }

    public OrderPayload(OrderInfo info, List<OrderDetails> details) {
        this.info = info;
        this.details = details;
    }

    public OrderInfo getInfo() {
        return info;
    }

    public void setInfo(OrderInfo info) {
        this.info = info;
    }

    public List<OrderDetails> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetails> details) {
        this.details = details;
    }
}
