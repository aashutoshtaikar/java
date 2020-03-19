package com.example.jpademo.service;

import java.util.List;

import com.example.jpademo.dto.OrderRequest;

public interface OrderRequestService{
    List<OrderRequest> getOrderRequests();
}