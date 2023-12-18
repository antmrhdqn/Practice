package com.ohgiraffers.practice1;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        int maxNum = (a > b)? a : b;
        System.out.println("두 수 중 큰 수는 " + maxNum + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        int result = a + b;
        return result;

    }

    public int minusTwoNumber(int a, int b) {
        int result = a - b;
        return result;
    }




}
