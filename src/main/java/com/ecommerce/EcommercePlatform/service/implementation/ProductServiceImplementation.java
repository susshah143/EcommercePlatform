package com.ecommerce.EcommercePlatform.service.implementation;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.model.Product;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.repositories.ProductRepository;
import com.ecommerce.EcommercePlatform.service.CustomerService;
import com.ecommerce.EcommercePlatform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product registerProduct(Product p) {
        return productRepository.save(p);
    }

    }
