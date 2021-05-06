package com.example.demoyml;

import com.example.demoyml.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoYmlApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoYmlApplication.class, args);
	}

	@Autowired
	Order order;

	@Override
	public void run(String... args) throws Exception {
		log.info("**** {}", order);
	}

}
