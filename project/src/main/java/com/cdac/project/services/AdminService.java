package com.cdac.project.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.dao.AdminDao;
import com.cdac.project.model.AdminLogin;

@Service
public class AdminService {

	@Autowired
	private AdminDao dao;
	
	
	public void authenticate(AdminLogin admin) {
		int x =  dao.authenticate(admin);
		System.out.println(x);
	}
	
	public Collection<AdminLogin> getAdmin(){
		return dao.getAdmin();
	}
}
