package com.boyuanzhang.spring.di.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boyuanzhang.spring.di.consumer.xmlbased.MyXMLApplication;

public class ClientXMLApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Boyuan", "boyuan@abc.com");

		// close the context
		context.close();
	}
}
