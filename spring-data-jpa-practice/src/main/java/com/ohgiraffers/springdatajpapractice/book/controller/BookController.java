package com.ohgiraffers.springdatajpapractice.book.controller;

import com.ohgiraffers.springdatajpapractice.book.dto.BookDTO;
import com.ohgiraffers.springdatajpapractice.book.dto.CategoryDTO;
import com.ohgiraffers.springdatajpapractice.book.entity.Book;
import com.ohgiraffers.springdatajpapractice.common.Pagenation;
import com.ohgiraffers.springdatajpapractice.common.PagingButton;
import com.ohgiraffers.springdatajpapractice.book.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/add")
    public String addBokk() {
        List<BookDTO> bookList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            BookDTO book = new BookDTO();
            book.setBookTitle("Book " + i);
            book.setAuthor("Author " + i);
            book.setPublisher("Publisher " + i);
            book.setPublishedDate(LocalDate.now());
            book.setBorrowableStatus("Y");
            book.setCategoryDTO(new CategoryDTO(i, "categoryName" + i));

            bookList.add(book);
        }

        bookService.addBook(bookList);

        return "/main/main";
    }

    @GetMapping("/list")
    public String findMenuList(Model model, @PageableDefault Pageable pageable) {
        Page<BookDTO> bookList = bookService.findBookList(pageable);

        PagingButton paging = Pagenation.getPagingButtonInfo(bookList);

        model.addAttribute("bookList", bookList);
        model.addAttribute("paging", paging);

        return "book/list";
    }

    @GetMapping("/delete")
    public void deletePage() {

    }

    @PostMapping("/delete")
    public String deleteBook(@RequestParam Integer bookNo) {
        bookService.deleteBook(bookNo);
        return "redirect:/book/list";
    }

    @GetMapping("/modify")
    public void modifyPage() {}

    @PostMapping("/modify")
    public String modifyMenu(BookDTO modifyBook) {
        bookService.modifyBook(modifyBook);
        return "redirect:/book/list";
    }

    @PostMapping("/detail")
    public String detail(@RequestParam int bookNo, Model model) {
        BookDTO book = bookService.findBookByBookNo(bookNo);

        System.out.println(book);

        model.addAttribute("book", book);
        return "book/detail";
    }

    @PostMapping("/category/detail")
    public String categoryDetail(@RequestParam("categoryCode") int categoryCode, Model model) {
        BookDTO book = bookService.findBookByCategoryCode(categoryCode);
        model.addAttribute("book", book);
        return "/book/category";
    }

    @GetMapping(value = "/category", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList() {
        return bookService.findAllCategory();
    }

}
