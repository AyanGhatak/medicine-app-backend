package com.assignment.medicineappbackend.repository;

import com.assignment.medicineappbackend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Query("SELECT item FROM Cart item WHERE item.userId=(:userId)")
    Optional<List<Cart>> listAllCartItemsForUser(@Param("userId") Integer userId);

    @Query("SELECT item FROM Cart item WHERE item.userId=(:userId) AND item.productId=(:productId)")
    Optional<Cart> checkIfProductALreadyAdded(@Param("userId") Integer userId, @Param("productId") Integer productId);
}
