package com.cdac.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.project.model.UserDetails;
import com.cdac.project.services.UserServices;

@RestController
@RequestMapping(value= "/Restaurant")
public class UserController {
	
	@Autowired
	private UserServices service;
	
	@PostMapping
	@RequestMapping( value =  "/user" , consumes="application/json", produces= "application/json")
	public String userauthenticate(@RequestBody UserDetails user) {
		
//		if(service.userauthenticate(user)==1) {
//			return "Authentication success";
//		}
//		else {
//			return "Authentication failed";
//		}
		return "ok";
	}
	
	

}
