package com.pedro.paymentservice.services;

import com.pedro.paymentservice.model.Payment;

public interface PaymentServices {

    void sendPayment(Payment payment);
}
