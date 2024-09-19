package com.pedro.jsonconsumer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Payment implements Serializable {

       private Long id;
       private Long idUser;
       private Long idProduct;
       private String cardNumber;
}
