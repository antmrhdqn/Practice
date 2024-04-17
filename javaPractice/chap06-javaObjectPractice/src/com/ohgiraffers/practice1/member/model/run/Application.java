package com.ohgiraffers.practice1.member.model.run;

import com.ohgiraffers.practice1.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDTO a = new MemberDTO();

        System.out.println(a.getId());
        System.out.println(a.getPwd());
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getGender());
        System.out.println(a.getPhone());
        System.out.println(a.getEmail());

        a.setId("user01");
        a.setPwd("pass01");
        a.setName("홍길동");
        a.setGender('M');
        a.setPhone("010-1234-5678");
        a.setEmail("hong123@ohgiraffers.com");

        System.out.println(a.getId());
        System.out.println(a.getPwd());
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getGender());
        System.out.println(a.getPhone());
        System.out.println(a.getEmail());

    }









}
