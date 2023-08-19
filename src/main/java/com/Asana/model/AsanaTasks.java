package com.Asana.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AsanaTasks")
public class AsanaTasks {

	@Id
	private long taskId;
	private String name;
	private String assignee;
	private String dueDate;
	private String description;
	
	public AsanaTasks() {
	}

	public AsanaTasks(long taskId, String name, String assignee, String dueDate, String description) {
		super();
		this.taskId = taskId;
		this.name = name;
		this.assignee = assignee;
		this.dueDate = dueDate;
		this.description = description;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AsanaTasks [taskId=" + taskId + ", name=" + name + ", assignee=" + assignee + ", dueDate=" + dueDate
				+ ", description=" + description + "]";
	}
	
	
}
