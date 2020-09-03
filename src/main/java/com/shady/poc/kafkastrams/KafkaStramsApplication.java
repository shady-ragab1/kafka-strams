package com.shady.poc.kafkastrams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaStramsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStramsApplication.class, args);
	}

}
