package com.ohgiraffers.mapping.book;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class SaleDate {

    @Column(name = "sale_date")
    private LocalDate saleDate;

    protected SaleDate() {}

    public SaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "SaleDate{" +
                "saleDate=" + saleDate +
                '}';
    }
}
