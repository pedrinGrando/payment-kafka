package com.pedro.paymentservice.resource.impl;

import com.pedro.paymentservice.model.Payment;
import com.pedro.paymentservice.resource.PaymentResource;
import com.pedro.paymentservice.services.PaymentServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
public class PaymentResourceImpl implements PaymentResource {

     private final PaymentServices paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(payment);
    }
}
