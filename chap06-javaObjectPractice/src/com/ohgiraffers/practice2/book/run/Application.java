package com.ohgiraffers.practice2.book.run;

import com.ohgiraffers.practice2.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {
        BookDTO b = new BookDTO();
        b.printInformation();

        BookDTO c = new BookDTO("자바의 정석", " 도우출판", "남궁성");
        c.printInformation();

        BookDTO d = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        d.printInformation();

    }

}

