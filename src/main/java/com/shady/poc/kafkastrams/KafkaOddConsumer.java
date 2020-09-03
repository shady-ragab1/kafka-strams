package com.shady.poc.kafkastrams;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOddConsumer {

    @KafkaListener(topics = "${kafka.topic.odd-output}")
    public void consume(Long number)  {

        System.out.println(String.format("Consumed :: %d", number));
    }
}
