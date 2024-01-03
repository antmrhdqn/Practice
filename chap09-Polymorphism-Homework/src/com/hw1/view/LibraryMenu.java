package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println(age);
        sc.nextLine();
        System.out.println("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);
        System.out.println(gender);
        Member mem = new Member(name, age, gender);
        lm.insertMember(mem);

        while (true) {
            System.out.println(" ==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");

            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(lm.myInfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    return;
                default:
                    System.out.print("잘못된 입력입니다. 다시 입력하세요.");
            }

        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번도서 : " + bList[i]);
        }
    }


    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);

        for (Book check : searchList) {
            if(check != null)
            System.out.println(check);
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);

        switch (result) {
            case 0 :
                System.out.println("성공적으로 대여되었습니다.");
            case 1 :
                System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
        }

    }

}
