package com.daily.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Point;
import com.daily.vo.User;

@Mapper
public interface PointMapper {

	void insertPoint(Point point);

	void insertPointAllUser(Point point);

	List<Point> selectUserPoint();

	void updateTargetByUno(User user);

	User selectEmailByUno(int uno);

	List<Point> selectUserPointByUno(Point point);
		
}
