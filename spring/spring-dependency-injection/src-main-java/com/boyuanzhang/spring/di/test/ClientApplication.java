package com.boyuanzhang.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.boyuanzhang.spring.di.configuration.DIConfiguration;
import com.boyuanzhang.spring.di.consumer.annobased.MyApplication;

public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);

		app.processMessage("Hi Boyuan", "boyuan@abc.com");

		// close the context
		context.close();
	}
}
