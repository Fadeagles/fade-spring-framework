package com.fade.spring.debug;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoService {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String sayHello() {
		return "DemoService says: " + this.message;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	@Autowired
	private BeanFactory beanFactory;

	@Autowired
	private MyService myService;

	public MyService getMyService() {
		return myService;
	}
}
