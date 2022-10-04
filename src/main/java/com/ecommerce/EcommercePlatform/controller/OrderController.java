package com.ecommerce.EcommercePlatform.controller;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.OrderRequest;
import com.ecommerce.EcommercePlatform.model.dto.OrderRequestDTO;
import com.ecommerce.EcommercePlatform.service.CustomerService;
import com.ecommerce.EcommercePlatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")

public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public OrderRequest createOrder(@RequestBody OrderRequestDTO order) throws CustomerNotFound {

        OrderRequest response = orderService.createOrder(order);
        return response;

    };
}


