package com.krush.example.springtask.poc.config;

import javax.sql.DataSource;

import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.stereotype.Component;
@Component
public class PocTaskConfigurer extends DefaultTaskConfigurer{
    public PocTaskConfigurer(DataSource dataSource){
        super(dataSource);
    }
}