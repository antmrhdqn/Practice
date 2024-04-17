package com.ohgiraffers.hw1.comparator;

import java.util.Comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

public class AscBookTitle implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

}