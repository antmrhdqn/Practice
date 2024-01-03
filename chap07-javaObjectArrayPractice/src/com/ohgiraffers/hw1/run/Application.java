package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] e = new EmployeeDTO[3];

        e[0] = new EmployeeDTO();
        e[1] = new EmployeeDTO(1,"홍길동", 19, 'M', "010-2222-3333");
        e[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "tjdnf");

        e[0].setEmpNo(0);
        e[0].setEmpName("김말똥");
        e[0].setDept("영업부");
        e[0].setJob("팀장");
        e[0].setAge(30);
        e[0].setGender('M');
        e[0].setSalary(3000000);
        e[0].setBonusPoint(0.2);
        e[0].setPhone("01055559999");
        e[0].setAddress("전라도 광주");

        e[1].setDept("기획부");
        e[1].setJob("부장");
        e[1].setSalary(4000000);
        e[1].setBonusPoint(0.3);

        System.out.println(e[0].information());
        System.out.println(e[2].information());




    }

}
