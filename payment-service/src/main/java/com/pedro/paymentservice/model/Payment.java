package com.pedro.paymentservice.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Payment implements Serializable {

       private Long id;
       private Long idUser;
       private Long idProduct;
       private String cardNumber;
}
