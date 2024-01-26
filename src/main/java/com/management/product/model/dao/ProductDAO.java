package com.management.product.model.dao;

import com.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {

    List<ProductDTO> selectAllProductList();

    int insertProduct(ProductDTO product);

    List<ProductDTO> selectProductByCondition();
}
