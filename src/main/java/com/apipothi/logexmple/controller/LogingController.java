package com.apipothi.logexmple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : MICROSERVICE-SPRINGBOOT
 * JAVA      : 11
 * Program   : 10. How to Configure Logging in Spring Boot Project
*/
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogingController {

	private final static Logger logger = LoggerFactory.getLogger(LogingController.class);

	@RequestMapping("/")
	public String getLogs() {

		logger.error("I AM ERROR");
		logger.warn("I AM WARNING");
		logger.info("I AM INFO");
		
		logger.debug("I MA DEBUG");
		logger.trace("I AM TRACE");
		
		return "Welcome to API POTHI ";
	}

}
