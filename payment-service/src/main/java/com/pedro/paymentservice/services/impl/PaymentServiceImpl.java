package com.pedro.paymentservice.services.impl;

import com.pedro.paymentservice.model.Payment;
import com.pedro.paymentservice.services.PaymentServices;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentServices {

    @Override
    public void sendPayment(Payment payment) {
          log.info("PAYMENT_SERVICE_IMPL ::: Payment received {}", payment);
    }
}
