package com.daily.service;

import java.util.List;

import com.daily.vo.Order;

public interface OrderService {

	void insertOrderByPnoAndUnoAndOno(Order order);

	void updateOrderByUno(Order order);

	List<Order> selectOrderByUno(Order order);

	int selectOrderByTotalPrice(int uno);

	int selectOrdernumByUno(Order order);

	List<Order> selectFinishOrderByUno(Order order);

	void deleteOrderByOno(int ono);

	List<Order> selectOrder();

	List<Order> selectOrderByOactive1(Order order);
	
	List<Order> selectOrderByOactive2(Order order);

	void updateOrderByOno1(Order order);

	void updateOrderByOno2(Order order);
	
	void updateOrderByOno3(Order order);
	
	void updateOrderByOno4(Order order);
	
	void updateOrderByOno5(Order order);
	
	void updateOrderByOno6(Order order);
	
	void updateOrderByOno7(Order order);
	
	void updateOrderByOno8(Order order);
	
	void updateOrderByOno9(Order order);
	
	void updateOrderByOno10(Order order);

	List<Order> selectOrder1();

	int selectSumSaleprice();

	int selectAvgSaleprice();

	void updateRefundByOno(Order order);

	void updateOrderByOno11(Order order);
	
	void updateOrderByOno12(Order order);

	int selectSumRefundSaleprice();

	int selectAvgSaleSaleprice();

	int selectSumSalepriceBy1Day();
	int selectSumSalepriceBy2Day();
	int selectSumSalepriceBy3Day();
	int selectSumSalepriceBy4Day();
	int selectSumSalepriceBy5Day();
	int selectSumSalepriceBy6Day();
	int selectSumSalepriceBy7Day();
	int selectSumSalepriceBy8Day();
	int selectSumSalepriceBy9Day();

	int selectAvgSalepriceBy1Day();
	int selectAvgSalepriceBy2Day();
	int selectAvgSalepriceBy3Day();
	int selectAvgSalepriceBy4Day();
	int selectAvgSalepriceBy5Day();
	int selectAvgSalepriceBy6Day();
	int selectAvgSalepriceBy7Day();
	int selectAvgSalepriceBy8Day();
	int selectAvgSalepriceBy9Day();

	int selectSumRefundSalepriceBy1Day();
	int selectSumRefundSalepriceBy2Day();
	int selectSumRefundSalepriceBy3Day();
	int selectSumRefundSalepriceBy4Day();
	int selectSumRefundSalepriceBy5Day();
	int selectSumRefundSalepriceBy6Day();
	int selectSumRefundSalepriceBy7Day();
	int selectSumRefundSalepriceBy8Day();
	int selectSumRefundSalepriceBy9Day();

	int selectAvgSaleSalepriceBy1Day();
	int selectAvgSaleSalepriceBy2Day();
	int selectAvgSaleSalepriceBy3Day();
	int selectAvgSaleSalepriceBy4Day();
	int selectAvgSaleSalepriceBy5Day();
	int selectAvgSaleSalepriceBy6Day();
	int selectAvgSaleSalepriceBy7Day();
	int selectAvgSaleSalepriceBy8Day();
	int selectAvgSaleSalepriceBy9Day();
	
	
}
