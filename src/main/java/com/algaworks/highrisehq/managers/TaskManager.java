package com.algaworks.highrisehq.managers;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.Task;
import com.sun.jersey.api.client.WebResource;

public class TaskManager extends HighriseManager {

	public TaskManager(WebResource webResource, String authorization) {
		super(webResource, authorization);
	}

	public Task create(Task task) {
		return this.create(task, Highrise.TASKS_PATH);
	}
	
}
