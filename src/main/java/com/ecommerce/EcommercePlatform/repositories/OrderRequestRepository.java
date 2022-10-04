package com.ecommerce.EcommercePlatform.repositories;

import com.ecommerce.EcommercePlatform.model.OrderRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRequestRepository extends CrudRepository<OrderRequest, Long> {
}
