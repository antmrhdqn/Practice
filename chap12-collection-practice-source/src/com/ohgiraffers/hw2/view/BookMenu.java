package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    public BookMenu() {
    }

    public void menu() {

    }

    public BookDTO inputBook() {
        int bNo = sc.nextInt();
        sc.nextLine();
        int category = sc.nextInt();
        sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();


        return new BookDTO(bNo, category, title, author);

    }

    public String inputTitle() {
        String searchTitle =sc.nextLine();

        return searchTitle;
    }
}
