package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public User validateUser(String username, String pass) {
		String jpql = "select u from user u where u.username=:em and u.password=:pa";
		return sf.getCurrentSession().createQuery(jpql, User.class).setParameter("em", username).setParameter("pa", pass)
				.getSingleResult();
	
	}


}
