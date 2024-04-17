package com.ohgiraffers.mapping.book;

import java.util.Date;
import java.util.List;

public class CartDTO {

    private SaleRecordDTO saleRecordDTO;
    private List<BookDTO> bookDTOList;

    public CartDTO() {
    }

    public CartDTO(SaleRecordDTO saleRecordDTO, List<BookDTO> bookDTOList) {
        this.saleRecordDTO = saleRecordDTO;
        this.bookDTOList = bookDTOList;
    }

    public SaleRecordDTO getSaleRecordDTO() {
        return saleRecordDTO;
    }

    public void setSaleRecordDTO(SaleRecordDTO saleRecordDTO) {
        this.saleRecordDTO = saleRecordDTO;
    }

    public List<BookDTO> getBookDTOList() {
        return bookDTOList;
    }

    public void setBookDTOList(List<BookDTO> bookDTOList) {
        this.bookDTOList = bookDTOList;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "saleRecordDTO=" + saleRecordDTO +
                ", bookDTOList=" + bookDTOList +
                '}';
    }
}
