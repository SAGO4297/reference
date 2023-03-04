package com.cdac.project.dao;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.project.model.UserDetails;

@Repository
public class UserDao {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate template;

	@Autowired
	private SessionFactory sessionFactory;

	
	public void registeruser(UserDetails userdetails ) {
		
		
	
			UserDetails temp=(UserDetails) template.queryForObject("select * from users_details where mobno = ? and password = ?" ,
					new Object[] {userdetails.getMobno(),userdetails.getPassword()}, new BeanPropertyRowMapper<UserDetails>(UserDetails.class));
			System.out.println(temp);
			System.out.println(userdetails);
			
			
	}
}
