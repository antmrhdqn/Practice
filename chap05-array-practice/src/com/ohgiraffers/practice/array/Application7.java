package com.ohgiraffers.practice.array;

import java.util.Random;
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


        /* 길이 4의 정수 배열 생성 */
        int[] num = new int[4];

        /* 각 인덱스에 0~9사이의 중복되지 않는 난수 저장 */

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }

        /*  4자리 숫자를 사용자에게 입력 받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자 맞추기 */

        /* 숫자를 입력받을 4자리 정수 배열*/
/*        Scanner sc = new Scanner(System.in);
        int[] inputNum = new int[4];
        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i] = sc.nextInt();
        }*/

        /* 스트라이크, 볼 체크 */
/*        int strike = 0;
        int ball = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == inputNum[i]) {
                strike += 1;
            } else {
                for (int j = 0; j < num.length; j++) {
                    if (num[i] == inputNum[j]) {
                        ball += 1;
                    }
                }

            }
        }*/

        /* 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임을 종료
         *  10번의 기회가 모두 소진되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다."를 출력 후 종료 */
        int count = 10;


        if (count > 0) {
            System.out.println("count");
            Scanner sc = new Scanner(System.in);
            int[] inputNum = new int[4];
            for (; count > 0; count--) {
                for (int i = 0; i < inputNum.length; i++) {
                    inputNum[i] = sc.nextInt();
                }

                int strike = 0;
                int ball = 0;
                for (int i = 0; i < num.length; i++) {
                    if (num[i] == inputNum[i]) {
                        strike += 1;
                    } else {
                        for (int j = 0; j < num.length; j++) {
                            if (num[i] == inputNum[j]) {
                                ball += 1;
                            }
                        }
                    }
                }
                if (strike == 4) {
                    System.out.println("정답입니다.");
                    break;
                }
            }

        } else {
            System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
        }
    }


}



