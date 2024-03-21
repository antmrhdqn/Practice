package com.ohgiraffers.requestmapping;

import java.util.Date;

public class OrderDTO {
    private String productName;
    private int amount;
    private String name;
    private String address;
    private String phoneNumber;
    private Date orderDate;

    public OrderDTO() {
    }

    public OrderDTO(String productName, int amount, String name, String address, String phoneNumber, Date orderDate) {
        this.productName = productName;
        this.amount = amount;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orderDate = orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
