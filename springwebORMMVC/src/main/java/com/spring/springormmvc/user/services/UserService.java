package com.spring.springormmvc.user.services;

import java.util.List;

import com.spring.springormmvc.user.entity.User;

public interface UserService {
	int create(User user);

	List<User> getUsers();

}
