package com.slavamashkov.kafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "slava", groupId = "test")
    void listener(String data) {
        System.out.println("Listener received: " + data + " \uD83D\uDE00");
    }
}
