package com.ecommerce.EcommercePlatform.service;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.OrderRequest;
import com.ecommerce.EcommercePlatform.model.dto.OrderRequestDTO;

public interface OrderService {

    public OrderRequest createOrder(OrderRequestDTO order) throws CustomerNotFound;
}
