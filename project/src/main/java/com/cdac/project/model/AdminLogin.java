package com.cdac.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN_LOGIN")
public class AdminLogin {

	@Id
	@Column(name="Admin_Id")
	private String adminId;
	
	@Column(name="PASSWORD")
	private String password;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", password=" + password + "]";
	}
	
	
	
}
