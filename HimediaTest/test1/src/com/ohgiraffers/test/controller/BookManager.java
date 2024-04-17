package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> list;

    public ArrayList<BookDTO> getList() {
        return list;
    }

    public BookManager() {
        ArrayList<BookDTO> arrayList = new ArrayList<>();
        this.list = arrayList;
    }

    public void addBook(BookDTO book) {
        this.list.add(book);


    }

    public void deleteBook(int index) {
        this.list.remove(index);
    }

//    public int searchBook(String bTitle) {
//        this.list.
//    }

    public void printBook(int index) {
        System.out.println(this.list.get(index));
    }


    public void displayAll() {
        list.toString();
    }

//    public ArrayList<BookDTO> sortedBookList(int select) {
//
//    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO list : br) {
            System.out.println(list);
        }
    }


}
