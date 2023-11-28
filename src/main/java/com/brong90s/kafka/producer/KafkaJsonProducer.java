package com.brong90s.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.brong90s.kafka.payload.Student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {
    private final KafkaTemplate<String, Student> kafkaTemplate;

    public void sendMessage(Student student) {
        log.info(String.format("Sending message to kafka Topic: %s", student.toString()));
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "kafkas")
                .build();

        kafkaTemplate.send(message);
    }
}
