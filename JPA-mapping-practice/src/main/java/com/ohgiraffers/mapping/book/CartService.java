package com.ohgiraffers.mapping.book;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Transactional
    public void registSaleRecord(CartDTO cartDTO) {
        List<Book> bookList = new ArrayList<>();
        for (BookDTO bookInfo : cartDTO.getBookDTOList()) {
            Category category = new Category(bookInfo.getCategoryDTO().getCategoryCode(), bookInfo.getCategoryDTO().getCateogryName());

            bookList.add(new Book(bookInfo.getBookTitle(),
                                    bookInfo.getAuthor(),
                                    bookInfo.getPublisher(),
                                    bookInfo.getPublishedDate(),
                                    bookInfo.getPrice(),
                                    category));
        }
        Cart cart = new Cart(
                new SaleRecord(new MemberId(cartDTO.getSaleRecordDTO().getMemberId()),
                               new SaleDate(cartDTO.getSaleRecordDTO().getSaleDate())),
                bookList);

        cartRepository.save(cart);

    }
}
