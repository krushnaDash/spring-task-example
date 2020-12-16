package com.krush.example.springtask.poc.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.krush.example.springtask.poc.task.HelloCommandLineTask;

@Configuration
public class ApplicationConfig {

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new HelloCommandLineTask();
	}
	@Bean
	public TaskExecutionListener getTaskExecutionListener() {
		return new TaskExecutionListener();
	}

}
