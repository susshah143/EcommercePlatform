package com.ecommerce.EcommercePlatform.controller;

import com.ecommerce.EcommercePlatform.exception.CustomerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {

    public ResponseEntity<Map<String,String>> handleCustomerNotFoundException(CustomerNotFound ex){

        Map<String, String> body = new HashMap<>();
        body.put("error", ex.getMessage());
        body.put("data", LocalDateTime.now().toString());

return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
