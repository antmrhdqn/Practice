package com.ohgiraffers.mapping.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_book_category")
public class Category {

    @Id
    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "category_name")
    private String cateogryName;

    protected Category() {}

    public Category(int categoryCode, String cateogryName) {
        this.categoryCode = categoryCode;
        this.cateogryName = cateogryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getCateogryName() {
        return cateogryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryCode=" + categoryCode +
                ", cateogryName='" + cateogryName + '\'' +
                '}';
    }
}
