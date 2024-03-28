package com.ohgiraffers.mapping.book;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class SaleRecord implements Serializable {

    @Embedded
    private MemberId memberId;

    @Embedded
    private SaleDate saleDate;

    protected SaleRecord() {}

    public SaleRecord(MemberId memberId, SaleDate saleDate) {
        this.memberId = memberId;
        this.saleDate = saleDate;
    }

    public MemberId getMemberId() {
        return memberId;
    }

    public SaleDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "SaleRecord{" +
                "memberId=" + memberId +
                ", saleDate=" + saleDate +
                '}';
    }
}
