package com.spring.springormmvc.user.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.springormmvc.user.dao.UserDao;
import com.spring.springormmvc.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Transactional
	public int create(User user) {

		return dao.create(user);
	}

	@Transactional
	public List<User> getUsers() {

		return dao.findAll();
	}

}
