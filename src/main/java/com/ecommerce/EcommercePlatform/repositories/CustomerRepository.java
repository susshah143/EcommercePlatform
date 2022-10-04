package com.ecommerce.EcommercePlatform.repositories;

import com.ecommerce.EcommercePlatform.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
