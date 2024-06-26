package com.ohgiraffers.springdatajpapractice.repository;

import com.ohgiraffers.springdatajpapractice.book.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT category_code, category_name FROM tbl_book_category ORDER BY category_code",
            nativeQuery = true)
    List<Category> findAllCategory();
}
