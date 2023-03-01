package com.example.demo.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {
	
	@Value("${name}")
	String name;

	public static Logger logger = LoggerFactory.getLogger(Demo.class);

	@GetMapping
	public String getName() {
		logger.info("Demo App");
		return name;
	}

}

