package com.miit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miit.dao.UserEsxampleDaoImpl;
import com.miit.entity.User;

@Service("userService")

public class UserServiceImpl implements UserService {

	@Autowired
	UserEsxampleDaoImpl userEsxampleDaoImpl;

	@Transactional
	public Boolean saveUser(User user) {
		// Business l;ogic
		userEsxampleDaoImpl.saveDatatoDb(user);
		return Boolean.TRUE;
	}

	@Override
	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		return null;
	}
}
