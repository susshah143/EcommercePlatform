package com.ecommerce.EcommercePlatform.service;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;

public interface CustomerService {

    Customer registerCustomer(Customer c);

    void updateEmail(Long id, String email) throws CustomerNotFound;
}


