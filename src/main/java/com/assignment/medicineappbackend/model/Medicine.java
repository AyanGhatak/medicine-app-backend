package com.assignment.medicineappbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Medicines")
public class Medicine {
    private int id;
    private String name;
    private Float discountedPrice;
    private String image;
    private Float mrp;
    private String quantity;
    private String ratingCount;
    private String ratings;

    public Medicine() {
    }

    public Medicine(int id, String name, Float discountedPrice, String image, Float mrp, String quantity, String ratingCount, String ratings) {
        this.id = id;
        this.name = name;
        this.discountedPrice = discountedPrice;
        this.image = image;
        this.mrp = mrp;
        this.quantity = quantity;
        this.ratingCount = ratingCount;
        this.ratings = ratings;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMrp() {
        return mrp;
    }

    public void setMrp(Float mrp) {
        this.mrp = mrp;
    }

    public Float getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
