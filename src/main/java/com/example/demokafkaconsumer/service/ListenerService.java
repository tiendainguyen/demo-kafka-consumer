package com.example.demokafkaconsumer.service;

import com.example.demokafkaconsumer.model.MessageObject;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ListenerService {
    private final Gson gson;
    @KafkaListener(topics = "topic", groupId = "my-group")
    public void listenToMyTopic(String message) {
        log.info("Received message from topic is: " + message);
        MessageObject messageObject = gson.fromJson(message,MessageObject.class);
        log.info("message object is: {}",  messageObject.toString());
    }
}
