package com.cdac.project.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.dao.StaffDao;
import com.cdac.project.model.StaffDetails;


@Service
public class StaffServices {
	
	@Autowired
	private StaffDao staffDao;
	
	public  Collection<StaffDetails> getStaffdetails(){
		
		return staffDao.getStaffDetails();
		
	}

	public void saveStaff(StaffDetails staff) {
		
	 staffDao.saveStaff(staff);
	}
	
	public void deleteStaff(String id) {
		
		staffDao.deleteStaff(id);
	}
	
	public StaffDetails getStaffDetails(String id) {
		return staffDao.getStaff(id);
	}
}
