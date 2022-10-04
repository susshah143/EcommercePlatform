package com.ecommerce.EcommercePlatform;

import com.ecommerce.EcommercePlatform.model.Customer;
import com.ecommerce.EcommercePlatform.repositories.CustomerRepository;
import com.ecommerce.EcommercePlatform.repositories.OrderRequestRepository;
import com.ecommerce.EcommercePlatform.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.AttributeOverride;

@SpringBootApplication
public class EcommercePlatformApplication{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRequestRepository orderRequestRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommercePlatformApplication.class, args);
	}
//	@Override
//	public void run(String...args ) throws Exception{
	//	Customer c = new Customer();
	//	c.setFirstName("chris");
	//	c.setLastName("bailey");
	//	c.setEmail("chris_bailey@hotmail.com");
	//	customerRepository.save(c);
	//}

}
