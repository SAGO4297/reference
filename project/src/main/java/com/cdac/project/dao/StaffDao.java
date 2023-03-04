package com.cdac.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.project.model.StaffDetails;

@Repository
public class StaffDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSource;
	
	public Collection<StaffDetails> getStaffDetails() {

		return jdbcTemplate.query("select * from staff_details",

				new BeanPropertyRowMapper<>(StaffDetails.class)

		);
	}

	public void saveStaff(StaffDetails staff) {
		jdbcTemplate.update("insert into staff_details values(?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				new Object[] {staff.getStaffId(),staff.getsName(),staff.getDesignation(),staff.getAge(),staff.getMobNo(),staff.getDeptId(),staff.getHireDate(),staff.getPhotoId(),staff.getAddress()});

	}

	public void deleteStaff(String id) {
		
		try(Connection con = dataSource.getConnection();
			PreparedStatement pstm = con.prepareStatement("delete from staff_details where staffid = ?");	
				){
			pstm.setString(1, id);
			pstm.execute();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
	
		public StaffDetails getStaff(String id) {
			
			return jdbcTemplate.queryForObject("select * from staff_details where id = ?", new Object[] {id}, new BeanPropertyRowMapper<>(StaffDetails.class));
		}
}
