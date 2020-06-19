package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.PointMapper;
import com.daily.vo.Point;
import com.daily.vo.User;

@Service("pointService")
public class PointServiceImpl implements PointService {
	
	@Autowired
	PointMapper pointMapper;

	@Override
	public void insertPoint(Point point) {
		pointMapper.insertPoint(point);
		
	}

	@Override
	public void insertPointAllUser(Point point) {
		pointMapper.insertPointAllUser(point);
		
	}

	@Override
	public List<Point> selectUserPoint() {
		return pointMapper.selectUserPoint();
	}

	@Override
	public void updateTargetByUno(User user) {
		pointMapper.updateTargetByUno(user);
		
	}

	@Override
	public User selectEmailByUno(int uno) {
		return pointMapper.selectEmailByUno(uno);
	}

	@Override
	public List<Point> selectUserPointByUno(Point point) {
		return pointMapper.selectUserPointByUno(point);
	}

}