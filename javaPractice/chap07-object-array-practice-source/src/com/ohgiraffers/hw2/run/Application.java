package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[] students = new StudentDTO[10];

        int count=0;
        while(true) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            students[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count ++;

            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            String str = sc.nextLine().toUpperCase();

            if(str.equals("N"))
                break;
        }
        for(StudentDTO student : students) {
            if(student == null) {
                break;
            }

            int sum = student.getKor() + student.getEng() + student.getMath();

            System.out.println(student.information() + ", 평균=" + sum / 3);
        }

    }


}
