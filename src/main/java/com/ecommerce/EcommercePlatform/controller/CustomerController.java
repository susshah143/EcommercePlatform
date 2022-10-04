package com.ecommerce.EcommercePlatform.controller;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public Customer customerCustomer(@RequestBody Customer customer){
        return customerService.registerCustomer(customer);
    }
   @PutMapping("/update/email")
    public void updateEmail(@RequestBody Customer emailRequest) throws CustomerNotFound {
      customerService.updateEmail(emailRequest.getId(), emailRequest.getEmail());
    }
}
