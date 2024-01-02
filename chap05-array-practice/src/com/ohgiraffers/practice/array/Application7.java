package com.ohgiraffers.practice.array;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        /* [ 숫자 야구게임 ]
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0~9 사이의 중복되지 않는 난수를 저장합니다.
         * 4자리 숫자를 사용자에게 입력 받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞는 게임입니다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼입니다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임을 종료하세요.
         * 10번의 기회가 모두 소진되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다."를 출력 후 종료하세요.
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다."를 출력하고,
         * 숫자를 다시 입력받되, 횟수는 차감하지 않습니다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        /* 길이 4의 정수 배열 만들고 0~9 사이의 중복되지 않는 난수 저장하기 */
        int[] randomNUm = new int[4];

        for (int i = 0; i < randomNUm.length; i++) {
            randomNUm[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (randomNUm[i] == randomNUm[j]) {
                    randomNUm[i] = (int) (Math.random() * 10);
                }
            }
        }

        /* 난수 배열 확인 */
        for (int check : randomNUm) {
            System.out.print(check);
        }

        /* 4자리 숫자를 입력받아 볼, 스트라이크 카운트, 10번의 기회 */
        Scanner sc = new Scanner(System.in);
        System.out.print("4자리 숫자를 입력해주세요 : ");
        String inputNum = sc.nextLine();
        int[] inputArr = new int[4];
        for (int i = 0; i < 4; i++) {
            inputArr[i] = (int) inputNum.charAt(i);
        }
        System.out.println(inputArr);
//        System.out.print("4자리 숫자를 입력해주세요 : ");
//        int inputNum1 = sc.nextInt();
//        sc.nextLine();
//        System.out.print("4자리 숫자를 입력해주세요 : ");
//        int inputNum2 = sc.nextInt();
//        sc.nextLine();
//        System.out.print("4자리 숫자를 입력해주세요 : ");
//        int inputNum3 = sc.nextInt();
//        sc.nextLine();
//        System.out.print("4자리 숫자를 입력해주세요 : ");
//        int inputNum4 = sc.nextInt();
//        sc.nextLine();
//        int[] inputArr = {inputNum1, inputNum2, inputNum3, inputNum4};


        int count = 10;
        int strike = 0;
        int ball = 0;


        while (true) {

            if (count > 0) {
                for (int i = 0; i < randomNUm.length; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (randomNUm[i] == inputArr[j]) {
                            strike += 1;
                        }
                    }
                }
            } else {
                break;
            }




        }




    }

}
