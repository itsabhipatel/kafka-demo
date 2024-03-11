package com.example.kafkademo.controller;

import com.example.kafkademo.entity.User;
import com.example.kafkademo.kafka.JsonKafkaProducer;
import com.example.kafkademo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private JsonKafkaProducer jsonkafkaProducer;


    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

    @GetMapping("/publish2")
    public ResponseEntity<String> publish2(@RequestBody User user){

        jsonkafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON Message sent to the topic");
    }
}
