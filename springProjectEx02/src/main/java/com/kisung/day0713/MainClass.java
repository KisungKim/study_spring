package com.kisung.day0713;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configTest = "T";
		String configReal = "R";
		String configNow = configTest;
		String configPro;
		if (configNow.equals(configReal)) {
			configPro = "real";
		} else {
			configPro = "test";
		}
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(configPro);
		ctx.load("applicationCTX_real.xml", "applicationCTX_test.xml");
		ServerInfo si = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(si.getIpNum());
		System.out.println(si.getPortNum());
		ctx.close();
		
		
	}

}
