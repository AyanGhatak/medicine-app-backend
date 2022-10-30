package com.assignment.medicineappbackend.repository;

import com.assignment.medicineappbackend.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

    @Query("SELECT details FROM OrderDetails details WHERE details.orderId=(:orderId)")
    Optional<List<OrderDetails>> findAllDetailsForOrder(@Param("orderId") Integer orderId);
}
