package com.example.SpringBootKafkaExample.controller;

import com.example.SpringBootKafkaExample.service.KafkaProducerService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message){
        kafkaProducerService.sendMessage(message);
        return "Message sent successfully";
    }
}
