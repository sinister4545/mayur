package com.app.service;

import com.app.pojos.User;

public interface IUserService {

	User validateUser(String user,String pass);

}
