package com.ohgiraffers.springdatajpapractice.book.dto;

import com.ohgiraffers.springdatajpapractice.book.entity.Category;

import java.time.LocalDate;

public class BookDTO {

    private int bookNo;
    private String bookTitle;
    private String author;
    private String publisher;
    private LocalDate publishedDate;
    private String borrowableStatus;
    private CategoryDTO categoryDTO;

    public BookDTO() {
    }

    public BookDTO(int bookNo, String bookTitle, String author, String publisher, LocalDate publishedDate, String borrowableStatus, CategoryDTO categoryDTO) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.borrowableStatus = borrowableStatus;
        this.categoryDTO = categoryDTO;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getBorrowableStatus() {
        return borrowableStatus;
    }

    public void setBorrowableStatus(String borrowableStatus) {
        this.borrowableStatus = borrowableStatus;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    public void setCategoryDTO(Category category) {
        this.categoryDTO = new CategoryDTO(category.getCategoryCode(), category.getCategoryName());
    }

    @Override
    public String toString() {
        return "bookDTO{" +
                "bookNo=" + bookNo +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate=" + publishedDate +
                ", borrowableStatus='" + borrowableStatus + '\'' +
                ", categoryDTO=" + categoryDTO +
                '}';
    }
}
