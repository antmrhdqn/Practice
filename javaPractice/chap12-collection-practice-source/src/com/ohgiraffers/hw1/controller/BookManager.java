package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List <BookDTO> bookList;
    public BookManager() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(BookDTO bookDTO) {
        bookList.add(bookDTO);
    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public void searchBook(String title) {
        for (BookDTO check : bookList) {
            if (check.getTitle().equals(title)) {
                System.out.println(check.toString());
            }
            System.out.println("조회된 도서가 목록에 없습니다.");
        }
    }

    public void displayAll() {
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
                bookList.sort(new AscBookNo());
                break;
            case 2:
                bookList.sort(new DescBookNo());
                break;
            case 3:
                bookList.sort(new AscBookTitle());
                break;
            case 4:
                bookList.sort(new DescBookTitle());
                break;
        }
        return bookList;
    }

    public void printBookList(List<BookDTO> printList) {

    }

}

