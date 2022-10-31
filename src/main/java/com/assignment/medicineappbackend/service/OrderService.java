package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.*;
import com.assignment.medicineappbackend.repository.CartRepository;
import com.assignment.medicineappbackend.repository.MedicineRepository;
import com.assignment.medicineappbackend.repository.OrderDetailsRepository;
import com.assignment.medicineappbackend.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
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

    @Autowired
    private CartRepository cartRepository;

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
                externalOrderDetail.setId(orderDetail.getId());
                externalOrderDetail.setOrderId(orderDetail.getOrderId());
                externalOrderDetail.setProductId(orderDetail.getProductId());
                externalOrderDetail.setQuantity(orderDetail.getQuantity());
                externalOrderDetail.setPrice(orderDetail.getPrice());
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

    public void saveOrder(OrderPayload order) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        OrderInfo orderInfo = order.getInfo();
        orderInfo.setOrderAt(timestamp.getTime());
        int orderId = orderInfoRepository.save(orderInfo).getId();
        List<OrderDetails> orderDetails = order.getDetails();
        for(OrderDetails orderDetail:orderDetails) {
            orderDetail.setOrderId(orderId);
        }
        orderDetailsRepository.saveAll(orderDetails);

        List<Cart> cartDetails = cartRepository.listAllCartItemsForUser(orderInfo.getUserId()).get();
        List<Integer> cartIds=new ArrayList<Integer>();
        for(Cart cartDetail:cartDetails) {
            cartIds.add(cartDetail.getId());
        }
        cartRepository.deleteAllById(cartIds);
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
