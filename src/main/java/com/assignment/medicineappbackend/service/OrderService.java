package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.OrderInfo;
import com.assignment.medicineappbackend.model.Order;
import com.assignment.medicineappbackend.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public List<Order> getOrdersForUser(Integer userId) {

        List<OrderInfo> ordersForUser = orderInfoRepository.findAllOrdersForUser(userId).get();
        List<Order> finalResult=new ArrayList<Order>();

        for(OrderInfo order:ordersForUser) {
            Order result = new Order();
            result.setInfo(order);
            // TODO: Fetch the order details here.
            result.setDetails(null);
            finalResult.add(result);
        }

        return finalResult;
    }
}
