package com.example.SpringBootKafkaExample.service;

import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducerService {
    private static final String TOPIC = "my_topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Message Sent: " + message);
    }
}
