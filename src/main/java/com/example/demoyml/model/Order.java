package com.example.demoyml.model;

import java.time.LocalDate;
import java.util.List;

import com.example.demoyml.config.YmlConfigLoad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Configuration
@PropertySource(value = "classpath:order.yml", factory = YmlConfigLoad.class)
@ConfigurationProperties(prefix = "orders")
@Data
public class Order {
    private String orderNo;
    private String date;
    private String customerName;
    private List<OrderLine> orderLines;
}
