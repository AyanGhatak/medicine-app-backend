package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.OrderInfo;
import com.assignment.medicineappbackend.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public OrderInfo getOrdersForUser(Integer userId) {
        return orderInfoRepository.findById(userId).get();
    }
}
