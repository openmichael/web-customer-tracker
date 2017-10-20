package com.michael.spring.service;

import java.util.List;

import com.michael.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
