package com.example.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic getTopic() {
        return TopicBuilder.name("kafka-demo").build();
    }

    @Bean
    public NewTopic getTopic2() {
        return TopicBuilder.name("kafka-demo2").build();
    }

}
