package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.OrderMapper;
import com.daily.vo.Order;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderMapper orderMapper;

	@Override
	public void insertOrderByPnoAndUnoAndOno(Order order) {
		orderMapper.insertOrderByPnoAndUnoAndOno(order);
	}

	@Override
	public void updateOrderByUno(Order order) {
		orderMapper.updateOrderByUno(order);
		
	}

	@Override
	public List<Order> selectOrderByUno(Order order) {
		List<Order> orders = orderMapper.selectOrderByUno(order);
		return orders;
	}

	@Override
	public int selectOrderByTotalPrice(int uno) {
		int sum = orderMapper.selectOrderByTotalPrice(uno);
		return sum;
	}

	@Override
	public int selectOrdernumByUno(Order order) {
		int sum = orderMapper.selectOrdernumByUno(order);
		return sum;
	}

	@Override
	public List<Order> selectFinishOrderByUno(Order order) {
		List<Order> orders = orderMapper.selectFinishOrderByUno(order);
		return orders;
	}

	@Override
	public void deleteOrderByOno(int ono) {
		orderMapper.deleteOrderByOno(ono);
		
	}

	@Override
	public List<Order> selectOrder() {
		return orderMapper.selectOrder();
	}

	@Override
	public List<Order> selectOrderByOactive1(Order order) {
		return orderMapper.selectOrderByOactive1(order);
	}
	
	@Override
	public List<Order> selectOrderByOactive2(Order order) {
		return orderMapper.selectOrderByOactive2(order);
	}

	@Override
	public void updateOrderByOno1(Order order) {
		orderMapper.updateOrderByOno1(order);
		
	}

	@Override
	public void updateOrderByOno2(Order order) {
		orderMapper.updateOrderByOno2(order);
		
	}
	
	@Override
	public void updateOrderByOno3(Order order) {
		orderMapper.updateOrderByOno3(order);
		
	}
	
	@Override
	public void updateOrderByOno4(Order order) {
		orderMapper.updateOrderByOno4(order);
		
	}
	
	@Override
	public void updateOrderByOno5(Order order) {
		orderMapper.updateOrderByOno5(order);
		
	}
	
	@Override
	public void updateOrderByOno6(Order order) {
		orderMapper.updateOrderByOno6(order);
		
	}
	
	@Override
	public void updateOrderByOno7(Order order) {
		orderMapper.updateOrderByOno7(order);
		
	}
	
	@Override
	public void updateOrderByOno8(Order order) {
		orderMapper.updateOrderByOno8(order);
		
	}
	
	@Override
	public void updateOrderByOno9(Order order) {
		orderMapper.updateOrderByOno9(order);
		
	}
	
	@Override
	public void updateOrderByOno10(Order order) {
		orderMapper.updateOrderByOno10(order);
		
	}

	@Override
	public List<Order> selectOrder1() {
		return orderMapper.selectOrder1();
	}

	@Override
	public int selectSumSaleprice() {
		int SumSaleprice = orderMapper.selectSumSaleprice();
		return SumSaleprice;
	}

	@Override
	public int selectAvgSaleprice() {
		int AvgSaleprice = orderMapper.selectAvgSaleprice();
		return AvgSaleprice;
	}

	@Override
	public void updateRefundByOno(Order order) {
		orderMapper.updateRefundByOno(order);
		
	}

	@Override
	public void updateOrderByOno11(Order order) {
		orderMapper.updateOrderByOno11(order);
		
	}

	@Override
	public void updateOrderByOno12(Order order) {
		orderMapper.updateOrderByOno12(order);
		
	}

	@Override
	public int selectSumRefundSaleprice() {
		int SumRefundSaleprice = orderMapper.selectSumRefundSaleprice();
		return SumRefundSaleprice;
	}

	@Override
	public int selectAvgSaleSaleprice() {
		int AvgSaleSaleprice = orderMapper.selectAvgSaleSaleprice();
		return AvgSaleSaleprice;
	}

	@Override
	public int selectSumSalepriceBy1Day() {
		int SumSaleprice1Day = orderMapper.selectSumSalepriceBy1Day();
		return SumSaleprice1Day;
	}

	@Override
	public int selectSumSalepriceBy2Day() {
		int SumSaleprice2Day = orderMapper.selectSumSalepriceBy2Day();
		return SumSaleprice2Day;
	}

	@Override
	public int selectSumSalepriceBy3Day() {
		int SumSaleprice3Day = orderMapper.selectSumSalepriceBy3Day();
		return SumSaleprice3Day;
	}

	@Override
	public int selectSumSalepriceBy4Day() {
		int SumSaleprice4Day = orderMapper.selectSumSalepriceBy4Day();
		return SumSaleprice4Day;
	}

	@Override
	public int selectSumSalepriceBy5Day() {
		int SumSaleprice5Day = orderMapper.selectSumSalepriceBy5Day();
		return SumSaleprice5Day;
	}

	@Override
	public int selectSumSalepriceBy6Day() {
		int SumSaleprice6Day = orderMapper.selectSumSalepriceBy6Day();
		return SumSaleprice6Day;
	}

	@Override
	public int selectSumSalepriceBy7Day() {
		int SumSaleprice7Day = orderMapper.selectSumSalepriceBy7Day();
		return SumSaleprice7Day;
	}

	@Override
	public int selectSumSalepriceBy8Day() {
		int SumSaleprice8Day = orderMapper.selectSumSalepriceBy8Day();
		return SumSaleprice8Day;
	}

	@Override
	public int selectSumSalepriceBy9Day() {
		int SumSaleprice9Day = orderMapper.selectSumSalepriceBy9Day();
		return SumSaleprice9Day;
	}

	@Override
	public int selectAvgSalepriceBy1Day() {
		int AvgSaleprice1Day = orderMapper.selectAvgSalepriceBy1Day();
		return AvgSaleprice1Day;
	}

	@Override
	public int selectAvgSalepriceBy2Day() {
		int AvgSaleprice2Day = orderMapper.selectAvgSalepriceBy2Day();
		return AvgSaleprice2Day;
	}

	@Override
	public int selectAvgSalepriceBy3Day() {
		int AvgSaleprice3Day = orderMapper.selectAvgSalepriceBy3Day();
		return AvgSaleprice3Day;
	}

	@Override
	public int selectAvgSalepriceBy4Day() {
		int AvgSaleprice4Day = orderMapper.selectAvgSalepriceBy4Day();
		return AvgSaleprice4Day;
	}

	@Override
	public int selectAvgSalepriceBy5Day() {
		int AvgSaleprice5Day = orderMapper.selectAvgSalepriceBy5Day();
		return AvgSaleprice5Day;
	}

	@Override
	public int selectAvgSalepriceBy6Day() {
		int AvgSaleprice6Day = orderMapper.selectAvgSalepriceBy6Day();
		return AvgSaleprice6Day;
	}

	@Override
	public int selectAvgSalepriceBy7Day() {
		int AvgSaleprice7Day = orderMapper.selectAvgSalepriceBy7Day();
		return AvgSaleprice7Day;
	}

	@Override
	public int selectAvgSalepriceBy8Day() {
		int AvgSaleprice8Day = orderMapper.selectAvgSalepriceBy8Day();
		return AvgSaleprice8Day;
	}

	@Override
	public int selectAvgSalepriceBy9Day() {
		int AvgSaleprice9Day = orderMapper.selectAvgSalepriceBy9Day();
		return AvgSaleprice9Day;
	}

	@Override
	public int selectSumRefundSalepriceBy1Day() {
		int SumRefundSaleprice1Day = orderMapper.selectSumRefundSalepriceBy1Day();
		return SumRefundSaleprice1Day;
	}

	@Override
	public int selectSumRefundSalepriceBy2Day() {
		int SumRefundSaleprice2Day = orderMapper.selectSumRefundSalepriceBy2Day();
		return SumRefundSaleprice2Day;
	}

	@Override
	public int selectSumRefundSalepriceBy3Day() {
		int SumRefundSaleprice3Day = orderMapper.selectSumRefundSalepriceBy3Day();
		return SumRefundSaleprice3Day;
	}

	@Override
	public int selectSumRefundSalepriceBy4Day() {
		int SumRefundSaleprice4Day = orderMapper.selectSumRefundSalepriceBy4Day();
		return SumRefundSaleprice4Day;
	}

	@Override
	public int selectSumRefundSalepriceBy5Day() {
		int SumRefundSaleprice5Day = orderMapper.selectSumRefundSalepriceBy5Day();
		return SumRefundSaleprice5Day;
	}

	@Override
	public int selectSumRefundSalepriceBy6Day() {
		int SumRefundSaleprice6Day = orderMapper.selectSumRefundSalepriceBy6Day();
		return SumRefundSaleprice6Day;
	}

	@Override
	public int selectSumRefundSalepriceBy7Day() {
		int SumRefundSaleprice7Day = orderMapper.selectSumRefundSalepriceBy7Day();
		return SumRefundSaleprice7Day;
	}

	@Override
	public int selectSumRefundSalepriceBy8Day() {
		int SumRefundSaleprice8Day = orderMapper.selectSumRefundSalepriceBy8Day();
		return SumRefundSaleprice8Day;
	}

	@Override
	public int selectSumRefundSalepriceBy9Day() {
		int SumRefundSaleprice9Day = orderMapper.selectSumRefundSalepriceBy9Day();
		return SumRefundSaleprice9Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy1Day() {
		int AvgSaleSaleprice1Day = orderMapper.selectAvgSaleSalepriceBy1Day();
		return AvgSaleSaleprice1Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy2Day() {
		int AvgSaleSaleprice2Day = orderMapper.selectAvgSaleSalepriceBy2Day();
		return AvgSaleSaleprice2Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy3Day() {
		int AvgSaleSaleprice3Day = orderMapper.selectAvgSaleSalepriceBy3Day();
		return AvgSaleSaleprice3Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy4Day() {
		int AvgSaleSaleprice4Day = orderMapper.selectAvgSaleSalepriceBy4Day();
		return AvgSaleSaleprice4Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy5Day() {
		int AvgSaleSaleprice5Day = orderMapper.selectAvgSaleSalepriceBy5Day();
		return AvgSaleSaleprice5Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy6Day() {
		int AvgSaleSaleprice6Day = orderMapper.selectAvgSaleSalepriceBy6Day();
		return AvgSaleSaleprice6Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy7Day() {
		int AvgSaleSaleprice7Day = orderMapper.selectAvgSaleSalepriceBy7Day();
		return AvgSaleSaleprice7Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy8Day() {
		int AvgSaleSaleprice8Day = orderMapper.selectAvgSaleSalepriceBy8Day();
		return AvgSaleSaleprice8Day;
	}

	@Override
	public int selectAvgSaleSalepriceBy9Day() {
		int AvgSaleSaleprice9Day = orderMapper.selectAvgSaleSalepriceBy9Day();
		return AvgSaleSaleprice9Day;
	}

}