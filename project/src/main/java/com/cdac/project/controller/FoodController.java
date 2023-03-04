package com.cdac.project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.project.model.FoodDetails;
import com.cdac.project.services.FoodServices;

@RestController
@RequestMapping("getFoodDetails")
public class FoodController {
	
	@Autowired
	private FoodServices foodservices;
	
	
	@RequestMapping(value = "allfood", produces = "APPLICATION/JSON")
	public ResponseEntity<Collection<FoodDetails>> getAllFood(){
		
		Collection<FoodDetails> alldetails = foodservices.getAlldetails();
		
		return new ResponseEntity<Collection<FoodDetails>>(alldetails, HttpStatus.OK);
		
		}
	@PostMapping
	@RequestMapping(value="addfood", consumes = "application/json", produces = "application/json")
	public ResponseEntity<FoodDetails> addFoodItems(@RequestBody FoodDetails food){
		foodservices.saveFoodItem(food);
		return new ResponseEntity<FoodDetails>(food, HttpStatus.OK);
		
	}
	
}
