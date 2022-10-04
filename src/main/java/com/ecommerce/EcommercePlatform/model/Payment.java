package com.ecommerce.EcommercePlatform.model;

import com.ecommerce.EcommercePlatform.model.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "billing_address")
    private Address billingAddress;

    String modeOfPayment;
    private String confirmationCode;

}


