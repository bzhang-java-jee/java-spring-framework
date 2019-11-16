package com.boyuanzhang.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boyuanzhang.spring.di.services.EmailService;
import com.boyuanzhang.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"com.boyuanzhang.spring.di.consumer.annobased"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
