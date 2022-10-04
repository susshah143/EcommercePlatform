package com.ecommerce.EcommercePlatform.service.implementation;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(Customer c) {
        return customerRepository.save(c);
    }


    @Override
    public void updateEmail(Long id, String email) throws CustomerNotFound {

        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isPresent()){
            Customer fromDB = customerOptional.get();
            fromDB.setEmail(email);
            customerRepository.save(fromDB);
        }
        else{
            throw new CustomerNotFound("Customer with ID"+ id +"Not found in Database");
        }
    }
}
