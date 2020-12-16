package com.krush.example.springtask.poc.config;

import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;

/**
 * Life cycle event listener
 * @author krushna
 *
 */
public class TaskExecutionListener {

	@BeforeTask
	public void beforeTask(TaskExecution taskExecution) {
		// Default it take the application name
		taskExecution.setTaskName("PrintTime");
	
	}

	/**
	 * @param taskExecution
	 * We can set an exit message here 
	 */
	@AfterTask
	public void afterTask(TaskExecution taskExecution) {
		taskExecution.setExitMessage("I am Done");
	}

	@FailedTask
	public void onError(TaskExecution taskExecution, Throwable throwable) {
		taskExecution.setExitCode(101);
		
	}
}