package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberDTO() {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(1l);
        memberDTO.setNickname("봄이 올까요");
        return memberDTO;
    }

    @Bean
    public BoardDTO boardDTO() {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(1L);
        boardDTO.setTitle("의존성 주입 연습");
        boardDTO.setContent("게시글의 작성자 객체를 주입 받아볼게요!");
        boardDTO.setWriter(memberDTO());

        return boardDTO;
    }
}
