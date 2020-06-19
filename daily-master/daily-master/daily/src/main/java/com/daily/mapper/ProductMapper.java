package com.daily.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Product;
import com.daily.vo.User;

@Mapper
public interface ProductMapper {

	void insertProduct(Product product);

	List<Product> selectProduct();

	List<Product> selectProductByCategory(Product product);

	Product selectProductByPno(int pno);

	void updateProductByPno(Product product);

	void updateProduct1(Product product);

	List<Product> selectProductByAdmin();

	List<Product> selectProductsByCategory1(int category1);

	int selectCategoryCount(int count);
		
}
