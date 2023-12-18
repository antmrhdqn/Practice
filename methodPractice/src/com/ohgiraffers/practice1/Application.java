package com.ohgiraffers.practice1;

public class Application {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;

        Caculator calc = new Caculator();
        calc.checkMethod();
        System.out.println("1부터 10까지의 합 : " + calc.sum1to10());
        calc.checkMaxNumber(a, b);
        System.out.println("10과 20의 합은 : " + calc.sumTwoNumber(a, b));
        System.out.println("10과 5의 차는 : " + calc.minusTwoNumber(a, c));

    }
}
