package com.ecommerce.EcommercePlatform.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;

    private long quantityOrdered;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private OrderRequest orderRequest;
}
