package com.ecommerce.EcommercePlatform.service.implementation;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.model.OrderRequest;
import com.ecommerce.EcommercePlatform.model.Payment;
import com.ecommerce.EcommercePlatform.model.dto.OrderRequestDTO;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.repositories.OrderRequestRepository;
import com.ecommerce.EcommercePlatform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImplementation implements OrderService {
@Autowired
private OrderRequestRepository orderRepository;
@Autowired
private CustomerRepository customerRepository;
    @Override
    public OrderRequest createOrder(OrderRequestDTO orderRequest) throws CustomerNotFound {
        OrderRequest order = new OrderRequest();

        Optional<Customer> customerOptional = customerRepository.findById(orderRequest.getCustomer_id());
        if (customerOptional.isEmpty()){
            throw new CustomerNotFound("Customer with Id:" + orderRequest.getCustomer_id() + "is not found in DB");
        }
        order.setCustomerId(customerOptional.get());
        Payment payment = new Payment();
        if(orderRequest.isCashOnDelivery()){
            payment.setModeOfPayment("CASH");}
        else {
            //call an payment processing api happen in third party side
    payment.setModeOfPayment("CREDIT CARD");
    payment.setConfirmationCode("XYZ123");

        }

        order.setPayment(payment);
        order.setShippingAddress(orderRequest.getShippingAddress());
        order.setItems(orderRequest.getItems());
        return orderRepository.save(order);
    }
}
