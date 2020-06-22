package com.company.bpmdemo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "BPMDEMO_INSTRUMENT")
@Entity(name = "bpmdemo_Instrument")
public class Instrument extends AbstractEntity {
    private static final long serialVersionUID = 2495710950430332426L;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "RATING")
    private Double rating;
    @Column(name = "IS_SHOPPING_CART")
    private Boolean isShoppingCart;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setIsShoppingCart(Boolean isShoppingCart) {
        this.isShoppingCart = isShoppingCart;
    }

    public Boolean getIsShoppingCart() {
        return isShoppingCart;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getRating() {
        return rating;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}