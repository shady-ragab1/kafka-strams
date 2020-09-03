package com.shady.poc.kafkastrams;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEvenConsumer {

    @KafkaListener(topics = "${kafka.topic.even-output}")
    public void consume(Long number)  {
        System.out.println(String.format("Consumed :: %d", number));
    }
}
