package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
	private List<Customer> listOfProducts = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer customer = new Customer("135", "Pepe", "C/ Falsa", false);
		Customer customer2 = new Customer("531", "Andres", "C/ Verdadera", false);
		
		this.listOfProducts.add(customer);
		this.listOfProducts.add(customer2);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return this.listOfProducts;
	}

}
