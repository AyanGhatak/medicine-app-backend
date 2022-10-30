package com.assignment.medicineappbackend.model;

import java.util.*;

public class Order {

    private List<ExternalOrderDetails> details;
    private OrderInfo info;


    public Order() {
    }

    public Order(OrderInfo info, List<ExternalOrderDetails> details) {
        this.info = info;
        this.details = details;
    }

    public OrderInfo getInfo() {
        return info;
    }

    public void setInfo(OrderInfo info) {
        this.info = info;
    }

    public List<ExternalOrderDetails> getDetails() {
        return details;
    }

    public void setDetails(List<ExternalOrderDetails> details) {
        this.details = details;
    }
}
