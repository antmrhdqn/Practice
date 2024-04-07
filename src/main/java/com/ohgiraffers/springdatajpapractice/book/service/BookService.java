package com.ohgiraffers.springdatajpapractice.book.service;

import com.ohgiraffers.springdatajpapractice.book.dto.BookDTO;
import com.ohgiraffers.springdatajpapractice.book.dto.CategoryDTO;
import com.ohgiraffers.springdatajpapractice.book.entity.Book;
import com.ohgiraffers.springdatajpapractice.book.entity.Category;
import com.ohgiraffers.springdatajpapractice.repository.BookRepository;
import com.ohgiraffers.springdatajpapractice.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public BookService(BookRepository bookRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

   // 책 추가
    @Transactional
    public void addBook(List<BookDTO> bookList) {
        for (BookDTO book : bookList) {
            Book bookEntity = new Book(
                    book.getBookTitle(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getPublishedDate(),
                    book.getBorrowableStatus(),
                    new Category(book.getCategoryDTO().getCategoryCode(), book.getCategoryDTO().getCategoryName())
            );
            bookRepository.save(bookEntity);
        }
    }

    // 전체 책 목록 조회
    public Page<BookDTO> findBookList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
                pageable.getPageSize(),
                Sort.by("bookNo").descending());


        Page<Book> bookList = bookRepository.findBookList(pageable);


        Page<BookDTO> bookDTOList = bookList.map(book -> modelMapper.map(book, BookDTO.class));

        for (Book book : bookList) {
            bookDTOList.forEach(bookDTO -> bookDTO.setCategoryDTO(book.getCategory()));
        }

        return bookDTOList;
    }

    // 책 폐기
    @Transactional
    public void deleteBook (Integer bookNo){
        bookRepository.deleteById(bookNo);
    }

    // 책 정보 수정
    @Transactional
    public void modifyBook(BookDTO modifyBook) {
        Book foundBook = bookRepository.findById(modifyBook.getBookNo()).orElseThrow(IllegalArgumentException::new);

        foundBook = foundBook.bookTitle(modifyBook.getBookTitle()).builder();
    }
}

