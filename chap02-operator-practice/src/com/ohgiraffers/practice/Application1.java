package com.ohgiraffers.practice;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 람쥐가 도토리 홀짝 게임에 참여했습니다.
         * 도토리 갯수를 선언하고,
         * 선언한 도토리 갯수가 짝수이면 "짝이군!",
         * 짝수가 아니면 "홀이군!"을 출력하세요.
         *
         * ------- 출력 결과 화면 ----------
         * 예) 정수 7를 선언한 경우
         *
         * 홀이군!
         * */
        int dotori = 7;
        String result = (dotori % 2 == 1) ? "홀이군!" : "짝이군!";
        System.out.println(result);

    }

}
