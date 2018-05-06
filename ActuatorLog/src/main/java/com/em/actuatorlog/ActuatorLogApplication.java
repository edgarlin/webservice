package com.em.actuatorlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class ActuatorLogApplication {
	private static Logger logger = LoggerFactory.getLogger(ActuatorLogApplication.class);
	public static void main(String[] args) {
	    SpringApplication.run(ActuatorLogApplication.class, args);
	    logger.warn("Hello world.");
	}
}
