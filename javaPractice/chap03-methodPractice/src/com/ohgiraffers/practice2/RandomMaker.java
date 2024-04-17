package com.ohgiraffers.practice2;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        int range = (Math.max(min, max) - Math.min(min, max) + 1);
        int randomNumber = (int) (Math.random() * range) + Math.min(min, max);
        return randomNumber;

    }

    public String randomUpperAlpabet(int length) {

        char[] chArr = new char[length];
        String result = "";
        for (int i = 0; i < length; i++) {
            int Capital = (int) (Math.random() * 26) + 65; // A~Z = 65~90
            char ch = (char) Capital;
            chArr[i] = ch;
            result += chArr[i];

        }
        return result;

    }

    public String rockPaperScissors() {

        int num = (int) (Math.random() * 3) + 1;

//        switch (num) {
//            case 1:
//                return "바위";
//
//            case 2:
//                return "보";
//
//            case 3:
//                return "가위";
//        }

//        switch (num) {
//            case 1 : String rock = "바위";
//            return rock;
//
//            case 2 : String paper = "보";
//            return paper;
//
//            case 3 : String scissors = "가위";
//            return scissors;
//        }

        if (num == 1) {
            String rock = "바위";
            return rock;
        } else if (num == 2) {
            String paper = "보";
            return paper;
        } else {
            String scissors = "가위";
            return scissors;
        }



    }
    public String tossCoin() {
        int num = (int)(Math.random()*2) +1;
        return (num == 1)? "앞면" : "뒷면";
    }
}
