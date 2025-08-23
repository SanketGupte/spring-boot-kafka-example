package com.example.SpringBootKafkaExample.service;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumerService {

    @KafkaListener(topics = "my_topic", groupId = "group_id")
    public void consume(String message){
        System.out.println("Message received: " + message);
    }
}
