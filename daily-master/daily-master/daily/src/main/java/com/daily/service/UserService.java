package com.daily.service;

import java.util.List;

import com.daily.vo.Point;
import com.daily.vo.User;

public interface UserService {

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
