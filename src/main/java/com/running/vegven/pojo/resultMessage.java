package com.running.vegven.pojo;

import lombok.Data;

@Data
public class resultMessage {
	private boolean System;
	
	private String fromName;
	
	private Object message;

	public resultMessage(boolean system, String fromName, Object message) {
		super();
		System = system;
		this.fromName = fromName;
		this.message = message;
	}

	public boolean isSystem() {
		return System;
	}

	public void setSystem(boolean system) {
		System = system;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	
}
