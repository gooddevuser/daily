package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.ProductMapper;
import com.daily.vo.Order;
import com.daily.vo.Product;
import com.daily.vo.User;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public void insertProduct(Product product) {
		productMapper.insertProduct(product);
		
	}

	@Override
	public List<Product> selectProduct() {
		return productMapper.selectProduct();
	}

	@Override
	public List<Product> selectProductByCategory(Product product) {
		List<Product> products = productMapper.selectProductByCategory(product);
		return products;
	}

	@Override
	public Product selectProductByPno(int pno) {
		Product product = productMapper.selectProductByPno(pno);
		return product;
	}

	@Override
	public void updateProductByPno(Product product) {
		productMapper.updateProductByPno(product);
		
	}

	@Override
	public void updateProduct1(Product product) {
		productMapper.updateProduct1(product);
		
	}

	@Override
	public List<Product> selectProductByAdmin() {
		List<Product> products = productMapper.selectProductByAdmin();
		return products;
	}

	@Override
	public List<Product> selectProductsByCategory1(int category1) {
		List<Product> products = productMapper.selectProductsByCategory1(category1);
		return products;
	}

	@Override
	public int selectCategoryCount(int count) {
		int CategoryCount = productMapper.selectCategoryCount(count);
		return CategoryCount;
	}

}