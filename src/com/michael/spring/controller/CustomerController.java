package com.michael.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michael.spring.entity.Customer;
import com.michael.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Inject customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		//Get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();
		
		//Add the customer to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}
