package com.cdac.project.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.project.model.FoodDetails;

@Repository
public class FoodDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

public Collection<FoodDetails> getAlldetails(){
		
		
		return jdbcTemplate.query("select * from foodtbl", 
				
					new BeanPropertyRowMapper<>(FoodDetails.class)
				
				
				);
		
		
	}
	public void saveFoodItem(FoodDetails item) {
		jdbcTemplate.update("insert into foodtbl values(?,?,?,?,?,?)",
				new Object[] {item.getfId(),item.getfName(),item.getfPrice(),item.getfCategory(),item.getfImg(),item.getfDescript()});
		
	}


	}
	
	
