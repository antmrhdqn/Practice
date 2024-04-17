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
        e.setJob(sc.nextLine());

        System.out.print("나이를 입력하세요 : ");
        e.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("성별을 입력하세요 : ");
        e.setGender(sc.nextLine().charAt(0));

        System.out.print("월급을 입력하세요 : ");
        e.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.print("보너스를 입력하세요 : ");
        e.setBounsPoint(sc.nextDouble());
        sc.nextLine();

        System.out.print("핸드폰 번호를 입력하세요 : ");
        e.setPhone(sc.nextLine());

        System.out.print("주소를 입력하세요 : ");
        e.setAddress(sc.nextLine());

        System.out.println(e.getNumber());
        System.out.println(e.getName());
        System.out.println(e.getDept());
        System.out.println(e.getJob());
        System.out.println(e.getAge());
        System.out.println(e.getGender());
        System.out.println(e.getSalary());
        System.out.println(e.getBounsPoint());
        System.out.println(e.getPhone());
        System.out.println(e.getAddress());




    }

}
