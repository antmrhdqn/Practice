package com.ohgiraffers.mapping.book;

import java.time.LocalDate;
import java.util.Date;

public class BookDTO {

    private String bookTitle;
    private String author;
    private String publisher;
    private LocalDate publishedDate;
    private Price price;
    private Category categoryDTO;

    public BookDTO() {
    }

    public BookDTO(String bookTitle, String author, String publisher, LocalDate publishedDate, Price price, Category categoryDTO) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.price = price;
        this.categoryDTO = categoryDTO;
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Category getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(Category categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate=" + publishedDate +
                ", price=" + price +
                ", categoryDTO=" + categoryDTO +
                '}';
    }
}
