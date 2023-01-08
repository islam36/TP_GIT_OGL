package com.telly.service;

import com.telly.dao.User;
import com.telly.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void create(User user){
		userDao.create(user);
	}

}
