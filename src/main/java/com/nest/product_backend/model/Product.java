package com.nest.product_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private int productCode;
    private String productName;
    private String manDate;
    private String expDate;
    private String brand;
    private int price;
    private String sellerName;
    private String distributorName;

    public Product() {   }

    public Product(int id, int productCode, String productName, String manDate, String expDate, String brand, int price, String sellerName, String distributorName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manDate = manDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManDate() {
        return manDate;
    }

    public void setManDate(String manDate) {
        this.manDate = manDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
