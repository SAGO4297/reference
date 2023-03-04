package com.cdac.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.dao.UserDao;
import com.cdac.project.model.UserDetails;

@Service
public class UserServices {

	@Autowired
	private UserDao userDao;
	
	public int userauthenticate(UserDetails userDetails) {
		int a =userDao.registeruser(userDetails);
		return a;
	}
}
