package com.ohgiraffers.mapping.book;

import java.time.LocalDate;

public class SaleRecordDTO {
    private String memberId;
    private LocalDate saleDate;

    public SaleRecordDTO() {
    }

    public SaleRecordDTO(String memberId, LocalDate saleDate) {
        this.memberId = memberId;
        this.saleDate = saleDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "SaleRecordDTO{" +
                "memberId='" + memberId + '\'' +
                ", saleDate=" + saleDate +
                '}';
    }
}
