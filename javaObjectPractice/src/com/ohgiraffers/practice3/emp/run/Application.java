package com.ohgiraffers.practice3.emp.run;

import com.ohgiraffers.practice3.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeDTO e = new EmployeeDTO();

        System.out.print("번호를 입력하세요 : ");
        e.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("이름을 입력하세요 : ");
        e.setName(sc.nextLine());

        System.out.print("부서를 입력하세요 : ");
        e.setDept(sc.nextLine());

        System.out.print("직책을 입력하세요 : ");
        e.
        System.out.print("나이를 입력하세요 : ");
        System.out.print("성별을 입력하세요 : ");
        System.out.print("월급을 입력하세요 : ");
        System.out.print("보너스를 입력하세요 : ");
        System.out.print("핸드폰 번호를 입력하세요 : ");
        System.out.print("주소를 입력하세요 : ");




    }

}
