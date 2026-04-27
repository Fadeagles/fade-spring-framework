package com.fade.spring.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ObjectUtils;

public class XmlBeanDebugApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DemoService demoService = context.getBean("demoService", DemoService.class);
		System.out.println(demoService.sayHello());
		context.close();
	}
}
