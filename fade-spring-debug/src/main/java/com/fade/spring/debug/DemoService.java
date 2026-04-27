package com.fade.spring.debug;

public class DemoService {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String sayHello() {
		return "DemoService says: " + this.message;
	}
}
