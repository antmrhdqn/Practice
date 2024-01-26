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

        System.out.println("검색조건 : " + searchCondition.getOption());
        for (ProductDTO product : productList) {
            System.out.println(product.toString());
        }



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
