package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.UserMapper;
import com.daily.vo.Point;
import com.daily.vo.Product;
import com.daily.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
		
	}

	@Override
	public User selectUserByUno(int uno) {
		User user = userMapper.selectUserByUno(uno);
		return user;
	}

	@Override
	public void updateUserByUno(User user) {
		userMapper.updateUserByUno(user);
		
	}

	@Override
	public List<User> selectUser() {
		return userMapper.selectUser();
	}

	@Override
	public User selectUserByuseridAndpwd(User user) {
		User user2 = userMapper.selectUserByuseridAndpwd(user);
		return user2;
	}

	@Override
	public List<User> selectProductByOnoByPnoByUno1(User user) {
		List<User> users = userMapper.selectProductByOnoByPnoByUno1(user);
		return users;
	}

	@Override
	public void updatePointByUno(Point point) {
		userMapper.updatePointByUno(point);
		
	}

	@Override
	public void updatePointAllUser(Point point) {
		userMapper.updatePointAllUser(point);
		
	}

	@Override
	public void updateUser1(User user) {
		userMapper.updateUser1(user);
		
	}
	
	@Override
	public void updateUser2(User user) {
		userMapper.updateUser2(user);
		
	}
	
	@Override
	public void updateUser3(User user) {
		userMapper.updateUser3(user);
		
	}
	
	@Override
	public void updateUser4(User user) {
		userMapper.updateUser4(user);
		
	}
}