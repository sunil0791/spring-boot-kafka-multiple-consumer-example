package com.optym.kafka.stream;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.optym.kafka.dto.SimpleMessage;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = { "${topic.name}" }, groupId = "consumer-one")
	public void receive(SimpleMessage consumerMessage) {
		log.info("Received message from kafka queue: {}", consumerMessage.getBody());
	}
}
