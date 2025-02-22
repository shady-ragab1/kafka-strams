package com.shady.poc.kafkastrams;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private long counter = 0;

    @Autowired
    private KafkaTemplate<String, Long> kafkaTemplate;

    @Scheduled(fixedRate = 1000)
    public void produce() {
        System.out.println("Produced :: " + counter);
        kafkaTemplate.sendDefault(counter++);
    }
}
