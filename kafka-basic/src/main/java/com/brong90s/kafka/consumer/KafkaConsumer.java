package com.brong90s.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.brong90s.kafka.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
    // @KafkaListener(topics = "kafkas", groupId = "myGroup")
    // public void consumeMsg(String msg) {
    // log.info(String.format("Consuming the message from kafkas Topic:: %s", msg));
    // }

    @KafkaListener(topics = "kafkas", groupId = "myGroup")
    public void consumeMsg(Student student) {
        log.info(String.format("Consuming the message from kafkas Topics:: %s", student.toString()));
    }
}
