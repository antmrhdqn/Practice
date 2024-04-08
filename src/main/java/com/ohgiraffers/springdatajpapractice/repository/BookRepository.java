package com.ohgiraffers.springdatajpapractice.repository;

import com.ohgiraffers.springdatajpapractice.book.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("SELECT b FROM Book b JOIN FETCH b.category")
    Page<Book> findBookList(Pageable pageable);

    @Query("SELECT b FROM Book b WHERE b.category.categoryCode = :categoryCode")
    Book findByCategoryCode(int categoryCode);
}
