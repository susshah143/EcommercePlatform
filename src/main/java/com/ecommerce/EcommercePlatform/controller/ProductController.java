package com.ecommerce.EcommercePlatform.controller;

import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.model.Product;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.service.CustomerService;
import com.ecommerce.EcommercePlatform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product registerProduct(@RequestBody Product product){
        return productService.registerProduct(product);
    }
}
