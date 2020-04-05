package com.sda.oop.product;

import java.time.LocalDate;

public class Product {
    private String productName;
    private double productPrice;
    private LocalDate expirationDate;
    private int stock;

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public Product(final String productName, final double productPrice, final LocalDate expirationDate, final int stock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.expirationDate = expirationDate;
        this.stock = stock;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(final double productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int reduceStock(int numberOfItemsPurchased) {
        this.stock = this.stock - numberOfItemsPurchased;
        return this.stock;
    }

    @Override
    public String toString() {
        return "Product name: " + this.productName + " Product price: " + this.productPrice +
                " Expiration date :" + this.expirationDate + " Stock:" + this.stock;
    }
}
