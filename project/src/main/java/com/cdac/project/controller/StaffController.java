package com.cdac.project.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.project.model.StaffDetails;
import com.cdac.project.services.StaffServices;

@RestController
@RequestMapping(value= "Staff")
public class StaffController {

	@Autowired
	private StaffServices staffServices;

	@RequestMapping(value = "allstaff", produces = "APPLICATION/JSON")
	public ResponseEntity<Collection<StaffDetails>> getallStaff() {

		Collection<StaffDetails> allStaff = staffServices.getStaffdetails();

		return new ResponseEntity<Collection<StaffDetails>>(allStaff, HttpStatus.OK);

	}
	
	@PostMapping
	@RequestMapping(value = "addstaff",consumes = "APPLICATION/JSON" ,produces = "APPLICATION/JSON")
	public ResponseEntity<StaffDetails> postStaff(@RequestBody StaffDetails staffDetails) {

		staffServices.saveStaff(staffDetails);

		return new ResponseEntity<StaffDetails>(staffDetails, HttpStatus.OK);

	}
	
	@DeleteMapping(value = "deletestaff/{staffid}" , produces = "APPLICATION/JSON")
	public ResponseEntity<StaffDetails> deleteStaff(@PathVariable String staffid){
		
//		StaffDetails staffDetails = staffServices.getStaffDetails(staffid);
		staffServices.deleteStaff(staffid);
		
		return null;
//				new ResponseEntity<StaffDetails>(staffDetails, HttpStatus.OK);
	}
	
	

}
