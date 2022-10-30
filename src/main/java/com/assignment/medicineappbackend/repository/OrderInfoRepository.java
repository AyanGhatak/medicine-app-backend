package com.assignment.medicineappbackend.repository;

import com.assignment.medicineappbackend.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;

@Repository
@Transactional
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {

    @Query("SELECT info FROM OrderInfo info WHERE info.userId=(:userId)")
    Optional<List<OrderInfo>> findAllOrdersForUser(@Param("userId") Integer userId);

}
