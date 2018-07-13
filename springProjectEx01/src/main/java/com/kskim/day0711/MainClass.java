package com.kskim.day0711;

//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");
		System.out.println("생성 시작");
		ctx.refresh();
		
		
		Student s1 = ctx.getBean("001", Student.class);
		Student s2 = ctx.getBean("002", Student.class);
		StudentManager sm = ctx.getBean("class01", StudentManager.class);
		sm.addMember(s1);
		sm.addMember(s2);
		
		//This show about singleton
		Student s3 = ctx.getBean("001", Student.class);
		s3.setGrade(1.0);
		
		sm.showMemberInfo();
		 
		ctx.close();
		System.out.println("삭제 완료");
	}

}
