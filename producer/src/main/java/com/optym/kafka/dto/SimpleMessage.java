/**
 * 
 */
package com.optym.kafka.dto;

/**
 * @author Sunil Anjanappa
 *
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleMessage {
	private String body;
}
