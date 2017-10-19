package com.michael.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michael.spring.dao.CustomerDAO;
import com.michael.spring.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//Get customers from the DAO
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//Add the customer to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}