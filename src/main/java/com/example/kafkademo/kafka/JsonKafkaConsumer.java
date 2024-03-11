package com.example.kafkademo.kafka;

import com.example.kafkademo.entity.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = {"kafka-demo","kafka-demo2"}, groupId = "myGroup")
    public void consume(User message){
        System.out.println("Consumed message: " + message);
    }
}
