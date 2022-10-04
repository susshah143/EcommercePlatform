package com.ecommerce.EcommercePlatform.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@Entity
public class OrderRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "shipping_address")
    private Address shippingAddress;


    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerId;

    //multiple items
    @OneToMany(mappedBy = "orderRequest",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<OrderItem> items = new HashSet<>();


    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "payment_id")
    private Payment Payment;

    private Double subTotal;// sum of all products unit price times the quantity requested

@Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    private Double tax;

    private Double shippingCharges;

    private Double total;
}
