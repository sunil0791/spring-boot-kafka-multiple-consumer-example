/**
 * 
 */
package com.optym.kafka.dto;

/**
 * @author Sunil Anjanappa
 *
 */
import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<SimpleMessage> {
}