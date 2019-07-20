package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service 
@Transactional
public class UserService implements IUserService{

	@Autowired
	private IUserDao dao;
	@Override
	public User validateUser(String user, String pass) {
		
		return dao.validateUser(user, pass);
	}

}
