package com.assignment.medicineappbackend.model;

public class CartDetails extends Cart {
    private String name;
    private Float price;
    private String image;

    public CartDetails() {

    }

    public CartDetails(Cart cartItem) {
        super(cartItem.id, cartItem.userId, cartItem.productId, cartItem.quantity);
    }

    public CartDetails(int id, int userId, int productId, int quantity, String name, Float price, String image) {
        super(id, userId, productId, quantity);
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
