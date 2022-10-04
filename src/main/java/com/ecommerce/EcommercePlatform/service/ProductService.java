package com.ecommerce.EcommercePlatform.service;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.model.Product;

public interface ProductService {

    Product registerProduct(Product p);

}

