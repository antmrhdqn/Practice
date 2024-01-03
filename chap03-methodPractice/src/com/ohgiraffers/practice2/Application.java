package com.ohgiraffers.practice2;

public class Application {
    public static void main(String[] args) {

        RandomMaker random = new RandomMaker();
        System.out.println(random.randomUpperAlpabet(13));
        System.out.println(random.rockPaperScissors());
        System.out.println(random.tossCoin());

    }
}
