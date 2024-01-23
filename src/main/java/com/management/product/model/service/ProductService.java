package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class ProductService {

    private ProductDAO productDAO;

    public List<ProductDTO> selectAllProductList() {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectAllProductList();
        sqlSession.close();

        return productList;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        // 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.

        List<ProductDTO> productList = new ArrayList<>();
        return null;

    }

    public boolean registNewProduct(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.insertProduct(product);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;

    }

    public boolean modifyProductInfo(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        // 5. 제품 정보를 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();

        productDAO = sqlSession.getMapper(ProductDAO.class);
        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }
}
