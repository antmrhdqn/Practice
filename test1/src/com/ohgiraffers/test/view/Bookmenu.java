package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookmenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public Bookmenu() {
        while (true) {
        System.out.println("======== 메뉴 ========");
        System.out.println("1. 책 추가");
        System.out.println("2. 책 삭제");
        System.out.println("3. 책 검색");
        System.out.println("4. 책 정보 출력");
        System.out.println("5. 카테고리 순으로 정렬");
        System.out.println("6. 책 목록 출력");
        System.out.println("0. 프로그램 종료");


        System.out.print("메뉴 번호를 입력해주세요 : ");
        int inputMenu = sc.nextInt();
        sc.nextLine();

            switch (inputMenu) {


                case 1:
                    BookDTO book = inputBook();
                    bm.addBook(book);
                    break;
                case 2:
                    int index = inputBookNo();
                    bm.deleteBook(index);
                    break;
                case 3:
                    String title = inputBookTitle();
//                bm.searchBook(title); break;
                case 4:
                    int index1 = inputBookNo();
                    bm.printBook(index1);
                    break;
                case 5:
                    int select = inputBookNo();
//                bm.sortedBookList(select); break;
                case 6:
                    bm.printBookList(bm.getList());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("메뉴 번호를 다시 입력해주세요");
            }
        }
    }

    public void menu() {

    }

    public BookDTO inputBook() {
        System.out.print("카테고리를 입력해주세요 (1.인문, 2. 자연과학, 3. 의료, 4. 기타 : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("책 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("작가명을 입력해주세요 : ");
        String author = sc.nextLine();



        BookDTO bookDTO = new BookDTO(category, title, author);
        System.out.print("책번호를 입력해주세요 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        bookDTO.setbNo(bNo);

        return bookDTO;
    }

    public String inputBookTitle() {
        System.out.print("책 이름을 입력하세요 : ");
        String bookTitle = sc.nextLine();
        return bookTitle;

    }

    public int inputBookNo() {
        System.out.println("책 번호를 입력해주세요: ");
        int BookNo = sc.nextInt();
        sc.nextLine();
        return BookNo;
    }


}
