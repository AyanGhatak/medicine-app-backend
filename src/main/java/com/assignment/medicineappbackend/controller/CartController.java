package com.assignment.medicineappbackend.controller;

import com.assignment.medicineappbackend.model.Cart;
import com.assignment.medicineappbackend.model.CartDetails;
import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @CrossOrigin
    @GetMapping("/{userId}")
    public ResponseEntity<List<CartDetails>> get(@PathVariable Integer userId) {
        try {
            List<CartDetails> cartItems = cartService.listAllCartItems(userId);
            return new ResponseEntity<List<CartDetails>>(cartItems, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<CartDetails>>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @PostMapping("/")
    public Cart add(@RequestBody Cart cartItem) {
        // Fetch if a record exists, if not add it. otherwise append it.
        return cartService.upsertCartItem(cartItem);
    }
}
