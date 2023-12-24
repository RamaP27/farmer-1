package com.example.farmershouse.controller;

import com.example.farmershouse.model.Farmer;
import com.example.farmershouse.service.FarmerService;
import com.example.farmershouse.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/api/")
public class MainController {

    @Autowired
    FarmerService farmerService;

    @Autowired
    PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Farmer>> getFarmerAndProducts() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(farmerService.getFarmerAndProducts());
    }

    @GetMapping("/getFarmers/")
    public ResponseEntity<List<Farmer>> getFarmerAndProducts_v2() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(List.of());
    }

    @GetMapping("/complete-payment/{orderId}/")
    public ResponseEntity<Boolean> completePayment(@PathVariable Long orderId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(paymentService.completePayment(orderId));
    }
}
