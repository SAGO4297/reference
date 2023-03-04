package com.cdac.project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.project.model.AdminLogin;
import com.cdac.project.services.AdminService;

@RestController
@RequestMapping("/Restaurant")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping
	@RequestMapping(value= "/admin", consumes="application/json", produces= "application/json")
	public String Controllerauthenticate(@RequestBody AdminLogin admin) {
		if( service.authenticate(admin)!=0) 
			return "Authentication Successful";
		else
			return "Authentication Failed";

	}
	
 @GetMapping
 @RequestMapping(value= "/getadmin", produces= "application/json")
 public ResponseEntity<Collection<AdminLogin>> ControllerAuth() {
	 
	 Collection<AdminLogin> login = service.getAdmin();
	 
	 return new ResponseEntity<Collection<AdminLogin>>(login,HttpStatus.OK)
	 
 }

}
