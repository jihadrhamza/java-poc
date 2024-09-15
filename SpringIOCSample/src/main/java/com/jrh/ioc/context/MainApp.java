package com.jrh.ioc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jrh.ioc.app.Dev;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Dev dev = context.getBean(Dev.class);
		dev.build();
		
		
	}

}
