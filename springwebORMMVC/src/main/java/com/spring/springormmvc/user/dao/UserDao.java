package com.spring.springormmvc.user.dao;

import java.util.List;

import com.spring.springormmvc.user.entity.User;

public interface UserDao {

	int create(User user);

	List<User> findAll();

}
