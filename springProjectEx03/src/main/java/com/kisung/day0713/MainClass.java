package com.kisung.day0713;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));

		} catch (Exception e) {}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("applicationCTX.xml");
		gCtx.refresh();
		
		AdminConnection ac = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin id is .. "+ac.getAdminId());
		System.out.println("admin pw is .. "+ac.getAdminPw());
		gCtx.close();
		ctx.close();
		
		
	}

}
