package com.ohgiraffers.springdatajpapractice.book.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @Column(name = "book_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookNo;

    @Column(name = "book_title", nullable = false)
    private String bookTitle;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    @Column(name = "published_date", nullable = false)
    private LocalDate publishedDate;

    @Column(name = "borrowable_status", nullable = false, columnDefinition = "char(1) default 'Y'")
    private String borrowableStatus;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_code")
    private Category category;

    public Book bookNo(int val) {
        this.bookNo = val;
        return this;
    }

    public Book bookTitle(String val) {
        this.bookTitle = val;
        return this;
    }

    public Book author(String val) {
        this.author = val;
        return this;
    }

    public Book publisher(String val) {
        this.publisher = val;
        return this;
    }

    public Book publishedDate(LocalDate val) {
        this.publishedDate = val;
        return this;
    }

    public Book cateogry(Category val) {
        this.category = val;
        return this;
    }

    public Book builder() {
        return new Book(bookNo, bookTitle, author, publisher, publishedDate, borrowableStatus, category);
    }

    public Book borrowableStatus(String val) {
        this.borrowableStatus = val;
        return this;
    }
    protected Book() {}

    public Book(String bookTitle, String author, String publisher, LocalDate publishedDate, String borrowableStatus, Category category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.borrowableStatus = borrowableStatus;
        this.category = category;
    }

    public Book(int bookNo, String bookTitle, String author, String publisher, LocalDate publishedDate, String borrowableStatus, Category category) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.borrowableStatus = borrowableStatus;
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

    public String getBorrowableStatus() {
        return borrowableStatus;
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
                ", borrowableStatus='" + borrowableStatus + '\'' +
                ", category=" + category +
                '}';
    }
}

