package com.ohgiraffers.practice.demensinal_array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 1. 가로와 세로 길이를 정수형으로 입력 받아
         * 2. 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 3. 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행과 세로 열의 길이는 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요."를 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 하세요.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

        Scanner sc = new Scanner(System.in);
        int width;
        int length;

        while (true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            width = sc.nextInt();

            if (width < 1 || width > 10) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");

            } else {
                break;
            }
        }

        while (true) {
            System.out.print("세로 행의 수를 입력하세요 : ");
            length = sc.nextInt();

            if (length < 1 || length > 10) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        int abc = 65;
        char[][] arr = new char[width][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) abc;
                abc++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

}
