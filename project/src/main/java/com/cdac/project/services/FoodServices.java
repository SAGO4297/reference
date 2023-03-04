package com.cdac.project.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.project.dao.FoodDAO;
import com.cdac.project.model.FoodDetails;

@Service
public class FoodServices {

	@Autowired
	private FoodDAO fooddao;

	public Collection<FoodDetails> getAlldetails() {

		return fooddao.getAlldetails();

	}

	public void saveFoodItem(FoodDetails items) {
		fooddao.saveFoodItem(items);
	}

	
}
