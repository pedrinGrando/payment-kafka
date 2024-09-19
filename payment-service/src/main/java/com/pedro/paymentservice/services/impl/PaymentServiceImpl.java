package com.pedro.paymentservice.services.impl;

import com.pedro.paymentservice.model.Payment;
import com.pedro.paymentservice.services.PaymentServices;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentServices {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
          log.info("Payment received {}", payment);
          Thread.sleep(1000);

          log.info("Sending payment {}", payment);
          kafkaTemplate.send("payment_topic", payment);
    }
}
