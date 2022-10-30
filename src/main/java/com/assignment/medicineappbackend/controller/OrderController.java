package com.assignment.medicineappbackend.controller;

import com.assignment.medicineappbackend.model.Order;
import com.assignment.medicineappbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @CrossOrigin
    @GetMapping("/{userId}")
    public ResponseEntity<List<Order>> get(@PathVariable Integer userId) {
        try {
            List<Order> orders = orderService.getOrdersForUser(userId);
            return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Order>>(HttpStatus.NOT_FOUND);
        }
    }
}
