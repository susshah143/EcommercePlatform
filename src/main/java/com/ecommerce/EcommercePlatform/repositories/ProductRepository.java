package com.ecommerce.EcommercePlatform.repositories;

import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
