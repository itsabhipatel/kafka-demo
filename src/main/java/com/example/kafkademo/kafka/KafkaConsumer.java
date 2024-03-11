package com.example.kafkademo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = {"kafka-demo","kafka-demo2"}, groupId = "myGroup")
    public void consume(String message){
        System.out.println("Consumed message: " + message);
    }
}
