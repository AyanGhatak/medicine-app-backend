package com.assignment.medicineappbackend.model;

public class ExternalOrderDetails {

    protected int id;
    protected int orderId;
    protected int productId;

    protected int quantity;

    protected Float price;

    private String name;
    private String image;

    public ExternalOrderDetails(){

    }

    public ExternalOrderDetails(int id, int orderId, int productId, int quantity, Float price,
                                String name, String image) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
