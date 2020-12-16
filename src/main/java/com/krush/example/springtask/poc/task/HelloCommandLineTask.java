package com.krush.example.springtask.poc.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class HelloCommandLineTask implements CommandLineRunner {
	Logger log= LoggerFactory.getLogger(HelloCommandLineTask.class);
	@Override
	public void run(String... args) throws Exception {
		
		String hello="";
		
		log.info("Hello, World!");
		
		log.info("Is String blank{}",hello.isBlank());
		
	}

}
