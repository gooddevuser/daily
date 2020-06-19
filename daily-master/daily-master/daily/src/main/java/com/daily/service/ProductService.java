package com.daily.service;

import java.util.List;

import com.daily.vo.Order;
import com.daily.vo.Product;
import com.daily.vo.User;

public interface ProductService {

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
