package com.cdac.project.dao;

import java.util.Collection;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.project.model.AdminLogin;

@Repository
public class AdminDao {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate template;

	@Autowired
	private SessionFactory sessionFactory;

	
	@SuppressWarnings("deprecation")
	public int authenticate(AdminLogin admin) {


try {
		AdminLogin temp = (AdminLogin) template.queryForObject("select * from Admin_Login where Admin_Id = ? and Password = ?",
				new Object[] { admin.getAdminId(),admin.getPassword()}, new BeanPropertyRowMapper<AdminLogin>(AdminLogin.class));
		System.out.println(temp);
		System.out.println(admin);
		

	if (temp!=null)
		return 1;
	return 0;
} catch (Exception e) {
	return 0;
}
		

		
	}

	public Collection<AdminLogin> getAdmin() {
		return template.query("select * from Admin_Login", new BeanPropertyRowMapper<AdminLogin>(AdminLogin.class));

	}

}
