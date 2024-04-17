package com.ohgiraffers.practice;

import java.util.Scanner;

public class switchCase {

    public void switchVendingMachine() {
        /* < switch-case문 이용 실습 >
         * 1. Scanner를 이용해 음료 이름(String)과 개수(count)룰 입력받는다.
         * 2. switch-case문을 사용해 전체 가격을 구한다.
         * 3. [ '음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해주세요. ]
         * 위와 같이 출력되도록 한다.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Ohgiraffers Vending Machine ===");
        System.out.println("코카콜라    칠성사이다  피크닉  핫식스");
        /* 코카콜라 1700원 / 칠성사이다 1500원 / 피크닉 1000원 / 핫식스 2100원 */
        System.out.println("====================================");
        System.out.print("음료를 선택해 주세요 : ");
        String drink = sc.nextLine();

        int count = 0;
        int price = 0;



        switch (drink) {
            case "코카콜라":
                System.out.print("개수를 선택해 주세요 : ");
                count = sc.nextInt();
                price = 1700 * count;
                System.out.println(drink + "을 " + count + "개 선택하셨습니다. " + price + "을 투입해주세요. ");

                break;
            case "칠성사이다":
                System.out.print("개수를 선택해 주세요 : ");
                count = sc.nextInt();
                price = 1500 * count;
                System.out.println(drink + "을 " + count + "개 선택하셨습니다. " + price + "을 투입해주세요. ");

                break;
            case "피크닉":
                System.out.print("개수를 선택해 주세요 : ");
                count = sc.nextInt();
                price = 1000 * count;
                System.out.println(drink + "을 " + count + "개 선택하셨습니다. " + price + "을 투입해주세요. ");

                break;
            case "핫식스":
                System.out.print("개수를 선택해 주세요 : ");
                count = sc.nextInt();
                price = 2100 * count;
                System.out.println(drink + "을 " + count + "개 선택하셨습니다. " + price + "을 투입해주세요. ");

                break;
        }

//        switch (drink) {
//            case "코카콜라":
//                System.out.println();
//            case "칠성사이다":
//            case "피크닉":
//            case "핫식스":
//                ;
//            default:
//                System.out.println("다시 선택해주세요");
//        }


    }
}
