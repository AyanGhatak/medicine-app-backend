package com.assignment.medicineappbackend.repository;

import com.assignment.medicineappbackend.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {
}
