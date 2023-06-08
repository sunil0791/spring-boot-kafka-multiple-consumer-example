/**
 * 
 */
package com.optym.kafka.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.optym.kafka.dto.SimpleMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, SimpleMessage> kafkaTemplate;

	@Value("${topic.name}")
	private String topicName;

	public void send(SimpleMessage message) {
		this.kafkaTemplate.send(topicName, message);
		log.info("Published the message [{}] to the kafka queue: [{}]", message.getBody(), topicName);
	}
}