package com.ohgiraffers.mapping.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
public class test {

    @Autowired
    private CartService cartService;

    // 구매자아이디, 판매일자, 책제목, 작가, 출판사, 출판일, 정가, 할인율, 카테고리 코드, 카테고리 이름
    private static Stream<Arguments> getPurchaseList() {
        return Stream.of(
                Arguments.of("user01", LocalDate.now(), // 첫 번째 책
                        new BookDTO("책제목1", "작가1", "출판사1", LocalDate.of(1998, 1, 1), new Price(50000, 0.3), new Category(1, "철학")),
                        new BookDTO("책제목2", "작가2", "출판사2", LocalDate.of(2001, 11, 1), new Price(10000, 0.1), new Category(2, "종교")),
                        new BookDTO("책제목3", "작가3", "출판사3", LocalDate.of(2011, 5, 1), new Price(20000, 0.5), new Category(3, "사회과학")),
                        new BookDTO("책제목4", "작가4", "출판사4", LocalDate.of(2017, 8, 11), new Price(15000, 0.15), new Category(4, "역사"))
                )
        );
    }

    @DisplayName("책구매 테스트")
    @ParameterizedTest
    @MethodSource("getPurchaseList")
    void purchaseTest(String memberId, LocalDate saleDate, BookDTO book1, BookDTO book2, BookDTO book3, BookDTO book4) {
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        CartDTO cartDTO = new CartDTO(new SaleRecordDTO(memberId, saleDate), bookList);
        Assertions.assertDoesNotThrow(
                () -> cartService.registSaleRecord(cartDTO)
        );


    }
}
