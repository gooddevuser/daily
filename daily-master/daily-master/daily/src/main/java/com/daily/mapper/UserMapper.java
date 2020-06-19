package com.daily.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Point;
import com.daily.vo.User;

@Mapper
public interface UserMapper {

	void insertUser(User user);

	User selectUserByUno(int uno);

	void updateUserByUno(User user);

	List<User> selectUser();

	User selectUserByuseridAndpwd(User user);

	List<User> selectProductByOnoByPnoByUno1(User user);

	void updatePointByUno(Point point);

	void updatePointAllUser(Point point);

	void updateUser1(User user);
	
	void updateUser2(User user);
	
	void updateUser3(User user);
	
	void updateUser4(User user);
}
