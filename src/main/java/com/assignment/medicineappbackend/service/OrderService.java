package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.model.OrderDetails;
import com.assignment.medicineappbackend.model.ExternalOrderDetails;
import com.assignment.medicineappbackend.model.OrderInfo;
import com.assignment.medicineappbackend.model.Order;
import com.assignment.medicineappbackend.repository.MedicineRepository;
import com.assignment.medicineappbackend.repository.OrderDetailsRepository;
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

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Autowired
    private MedicineRepository medicineRepository;

    public List<Order> getOrdersForUser(Integer userId) {

        List<OrderInfo> ordersForUser = orderInfoRepository.findAllOrdersForUser(userId).get();
        List<Order> finalResult=new ArrayList<Order>();

        for(OrderInfo order:ordersForUser) {
            // Find all the details for that order.
            int orderId = order.getId();
            List<OrderDetails> orderDetails = orderDetailsRepository.findAllDetailsForOrder(orderId).get();
            List<Integer> productIds=new ArrayList<Integer>();
            for(OrderDetails orderDetail:orderDetails) {
                productIds.add(orderDetail.getProductId());
            }

            // Fetch more rich information about the products in that order detail.
            List<Medicine> products = medicineRepository.findAllById(productIds);
            List<ExternalOrderDetails> externalOrderDetails=new ArrayList<ExternalOrderDetails>();
            for(OrderDetails orderDetail:orderDetails) {
                Medicine med = findProductByID(products, orderDetail.getProductId());
                ExternalOrderDetails externalOrderDetail = new ExternalOrderDetails();
                externalOrderDetail.setName(med.getName());
                externalOrderDetail.setImage(med.getImage());
                externalOrderDetails.add(externalOrderDetail);
            }

            Order result = new Order();
            result.setInfo(order);
            result.setDetails(externalOrderDetails);
            finalResult.add(result);
        }

        return finalResult;
    }

    private Medicine findProductByID(List<Medicine> products, Integer productId) {
        for (Medicine product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
