package com.daily.service;

import java.util.List;

import com.daily.vo.Point;
import com.daily.vo.User;

public interface PointService {

	void insertPoint(Point point);

	void insertPointAllUser(Point point);

	List<Point> selectUserPoint();

	User selectEmailByUno(int uno);
	
	void updateTargetByUno(User user);

	List<Point> selectUserPointByUno(Point point);

}
