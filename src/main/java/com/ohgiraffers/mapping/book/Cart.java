package com.ohgiraffers.mapping.book;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_cart")
public class Cart {

    @EmbeddedId
    private SaleRecord saleRecord;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Book> bookList;

    protected Cart() {}

    public Cart(SaleRecord saleRecord, List<Book> bookList) {
        this.saleRecord = saleRecord;
        this.bookList = bookList;
    }

    public SaleRecord getSaleRecord() {
        return saleRecord;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "SaleRecord=" + saleRecord +
                ", bookList=" + bookList +
                '}';
    }
}
