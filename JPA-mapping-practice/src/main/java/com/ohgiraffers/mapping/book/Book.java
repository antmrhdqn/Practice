package com.ohgiraffers.mapping.book;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @Column(name = "book_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookNo;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @Embedded
    private Price price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_code")
    private Category category;

    protected Book() {}

    public Book(String bookTitle, String author, String publisher, LocalDate publishedDate, Price price, Category category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.price = price;
        this.category = category;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public Price getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNo=" + bookNo +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedDate=" + publishedDate +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

