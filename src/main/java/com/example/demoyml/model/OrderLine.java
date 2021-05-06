package com.example.demoyml.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OrderLine {
    private String item;
    private int quantity;
    private BigDecimal unitPrice;
}
