package com.ecommerce.EcommercePlatform.model.dto;

import com.ecommerce.EcommercePlatform.model.Address;
import com.ecommerce.EcommercePlatform.model.OrderItem;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class OrderRequestDTOTest {

    private Address shippingAddress;
    private Long Customer_id;
    private Set<OrderItem> items;
    private String creditCardNumber;
    private boolean cashOnDelivery;
}
