package com.example.farmershouse.service;

import com.example.farmershouse.model.Farmer;
import com.example.farmershouse.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PaymentService {
    public Boolean completePayment(Long orderId) {
        // Integrate over orders and mark correct order as true
        return Boolean.TRUE;
    }
}
