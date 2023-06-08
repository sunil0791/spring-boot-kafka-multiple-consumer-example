/**
 * 
 */
package com.optym.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optym.kafka.dto.SimpleMessage;
import com.optym.kafka.stream.KafkaProducer;

/**
 * @author Sunil Anjanappa
 *
 */
@RestController
public class TestController {

	@Autowired
	KafkaProducer kafkaProducer;

	@GetMapping("/produce")
	public ResponseEntity produceKafka() {
		String ret = "Ok";
		SimpleMessage message = new SimpleMessage("ddd Producer");
		kafkaProducer.send(message);
		return ResponseEntity.status(HttpStatus.OK).body(ret);
	}

}
