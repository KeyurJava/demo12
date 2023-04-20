package com.miit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miit.entity.User;

@Repository
public class UserEsxampleDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveDatatoDb(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}
