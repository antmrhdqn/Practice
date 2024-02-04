package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

    public static int count;

    private ProductDTO[] products = null;
    public Scanner sc = new Scanner(System.in);

    {
        products = new ProductDTO[10];
    }



    public void mainMenu() {
        int select = 0;

        do {
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 전체 제품 조회");
            System.out.println("9. 프로그램 종료");

            select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    productInput();
                    break;
                case 2:
                    productPrint();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하였습니다. 다시 입력해 주세요.");
                    break;
            }

        } while (select != 9);
    }

    public void productInput() {

        System.out.print("제품 번호 : ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("제품 이름 : ");
        String pName = sc.nextLine();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        products[count] = new ProductDTO(pId, pName, price, tax);

    }

    public void productPrint() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].information());
        }
    }


}
