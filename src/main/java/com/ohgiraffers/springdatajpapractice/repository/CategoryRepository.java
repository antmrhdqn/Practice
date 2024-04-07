package com.ohgiraffers.springdatajpapractice.repository;

import com.ohgiraffers.springdatajpapractice.book.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
