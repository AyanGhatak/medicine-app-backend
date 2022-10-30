package com.assignment.medicineappbackend.controller;

import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.model.OrderInfo;
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
    public ResponseEntity<OrderInfo> get(@PathVariable Integer userId) {
        try {
            OrderInfo orderInfo = orderService.getOrdersForUser(userId);
            return new ResponseEntity<OrderInfo>(orderInfo, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<OrderInfo>(HttpStatus.NOT_FOUND);
        }
    }
}
