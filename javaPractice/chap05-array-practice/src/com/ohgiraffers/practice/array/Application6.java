package com.ohgiraffers.practice.array;

public class Application6 {

    public static void main(String[] args) {

        /* [ 로또번호 생성기 ]
         * 6칸짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * */

        /* 난수 생성 후 인덱스에 대입 */
        int[] intArr = new int[6];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 45) + 1;

        }

        /* 오름차순 정렬 */
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j<intArr.length; j++){
                if (intArr[i]<intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }

            }
        }
        for (int i =0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }

    }
}
