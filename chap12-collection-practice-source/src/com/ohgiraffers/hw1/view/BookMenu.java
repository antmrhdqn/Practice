package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void mainMenu() {
        do {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();
            BookMenu bookMenu = new BookMenu();

            switch (menu) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.printBookList(selectSortedBook());
                    break;
                case 3:
                    bm.deleteBook(inputBookNo());
                    break;
                case 4:
                    bm.searchBook(inputBookTitle());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.print("정말 끝내시겠습니까? (y/n) : ");
                    char answer = sc.next().toUpperCase().charAt(0);

                    if (answer == 'Y') {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else System.out.println("메뉴를 다시 불러옵니다.");

                    break;

                default:
                    System.out.println("잘못 입력하셨습니다."); break;
            }
        } while (true);
    }

    public BookDTO inputBook() {
        System.out.print("도서 장르 (1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타)");
        int bookCategory = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String bookAuthor = sc.nextLine();
        return new BookDTO(inputBookNo(), bookCategory, inputBookTitle(), bookAuthor);
    }

    public int inputBookNo() {
        System.out.print(" 도서 번호 : ");
        int bookNo = sc.nextInt();
        sc.nextLine();
        return bookNo;
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        String bookTitle = sc.nextLine();
        return bookTitle;
    }

    public List<BookDTO> selectSortedBook() {
        while (true) {
            System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
            System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
            System.out.println("3. 책 제목으로 오름차순 정렬");
            System.out.println("4. 책 제목으로 내림차순 정렬");
            System.out.print("번호 입력 : ");
            int inputNum;
            inputNum = sc.nextInt();
            sc.nextLine();
            if (inputNum < 1 || inputNum > 4) {
                List<BookDTO> list = bm.sortedBookList(inputNum);
                return list;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}
