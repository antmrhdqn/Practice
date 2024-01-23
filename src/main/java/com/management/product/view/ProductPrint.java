package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    public void printAllProductList(List<ProductDTO> allProductList) {

        for (ProductDTO product : allProductList) {
            System.out.println(product);
        }

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.


    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        // 3. 성공메시지를 출력하는 메소드
        switch (successCode) {
            case "insert":
                successMessage = "제품 등록에 성공했습니다.";
                break;
        }
        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.

    }

    public String printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList":
                errorMessage = "전체 제품 조회에 실패했습니다.";
                break;
            case "selectOne":
                errorMessage = "선택한 제품 조회에 실패했습니다.";
                break;
            case "insert" :
                errorMessage = "제품 등록에 실패했습니다.";
                break;
        }

        return errorMessage;


    }

}
