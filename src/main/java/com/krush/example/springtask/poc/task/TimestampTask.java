package com.krush.example.springtask.poc.task;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TimestampTask implements CommandLineRunner {
	
	Logger log= LoggerFactory.getLogger(TimestampTask.class);
	@Override
	public void run(String... args) throws Exception {
	
		log.info("Print time stamp {}", new Date());
		Thread.sleep(50000);
		
	}

}
