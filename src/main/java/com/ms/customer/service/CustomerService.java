package com.ms.customer.service;

import java.util.List;
import com.ms.customer.model.CustomerM;

public interface CustomerService {

	List<CustomerM> findAll();

	CustomerM findById(String cusId);

	CustomerM addCustomer(CustomerM customerm);

	CustomerM updateCustomer(CustomerM customerm);

	void deleteCustomer(String cusId);
}
