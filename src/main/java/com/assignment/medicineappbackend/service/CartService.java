package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.Cart;
import com.assignment.medicineappbackend.model.CartDetails;
import com.assignment.medicineappbackend.model.Order;
import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.repository.CartRepository;
import com.assignment.medicineappbackend.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private MedicineRepository medicineRepository;

    public List<CartDetails> listAllCartItems(Integer userId) {
        List<Cart> cartItems = cartRepository.listAllCartItemsForUser(userId).get();
        List<CartDetails> result=new ArrayList<CartDetails>();

        for(Cart cartItem:cartItems) {
            CartDetails cartItemWithDetails = new CartDetails(cartItem);
            Medicine medicine = medicineRepository.findById(cartItem.getProductId()).get();
            cartItemWithDetails.setName(medicine.getName());
            cartItemWithDetails.setPrice(medicine.getDiscountedPrice());
            cartItemWithDetails.setImage(medicine.getImage());
            result.add(cartItemWithDetails);
        }

        return result;
    }

    public Cart upsertCartItem(Cart cartItem) {
        Cart result = cartItem;
        try {
            Cart prevCart = cartRepository.checkIfProductALreadyAdded(cartItem.getUserId(), cartItem.getProductId())
                    .get();
            cartRepository.deleteById(prevCart.getId());
            cartItem.setQuantity(prevCart.getQuantity() + cartItem.getQuantity());
            cartRepository.save(cartItem);
            result = cartItem;
        } catch (NoSuchElementException e) {
            cartRepository.save(cartItem);
        }
        return result;
    }
}
