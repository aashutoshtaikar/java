package com.example.jpademo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.jpademo.dto.OrderRequest;
import com.example.jpademo.entity.Customer;
import com.example.jpademo.repository.CustomerRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderRequestServiceImpl implements OrderRequestService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<OrderRequest> getOrderRequests() {
        
        List<Customer> customers = customerRepository.findAll();
        List<OrderRequest> orderRequests = new ArrayList<>();
        customers.forEach(customer->{
            orderRequests.forEach(or->or.setCustomer(customer));
        });
        return orderRequests;
    }

}